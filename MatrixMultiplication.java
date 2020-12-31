import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        int row1, row2,coloumn1,coloumn2,i,j,k,sum;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of Matrix 1");
        row1 = in.nextInt();
        
        System.out.println("Enter the number columns of Matrix 1");
        coloumn1 = in.nextInt();
        System.out.println("Enter the number of rows of Matrix 2");
        row2 = in.nextInt();
        
        System.out.println("Enter the number of columns of Matrix 2");
        coloumn2 = in.nextInt();
        
        if(coloumn1==row2)
        {
        
        int matrix1[][] = new int[row1][coloumn1]; 
        int matrix2[][] = new int[row2][coloumn2]; 
        int resultMatrix[][] = new int[row1][coloumn2];
        
        System.out.println("Enter the elements of Matrix 1");
        
        for ( i= 0 ; i < row1 ; i++ ) { 
            for ( j= 0 ; j < coloumn1 ;j++ ) {
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the elements of Matrix 2");
        
        for ( i= 0 ; i < row2 ; i++ ) { 
            for ( j= 0 ; j < coloumn2 ;j++ ) {
                matrix2[i][j] = in.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Result Matrix is");
        for ( i= 0 ; i < row1 ; i++ ) { 
            for ( j= 0 ; j <coloumn2;j++) {
                sum=0;
                for ( k= 0 ; k <row2;k++ ) {
                    sum +=matrix1[i][k]*matrix2[k][j] ;
                }
        resultMatrix[i][j]=sum;
            }
        }
        for ( i= 0 ; i < row1; i++ ) {
            for ( j=0 ; j < coloumn2;j++ ) {
                System.out.print(resultMatrix[i][j]+" ");
            }    
        System.out.println();
        }
        }
        else {
        System.out.print("Error 404:Multiplication not found");
        System.out.println();
        System.out.println("Enter correct Values");
        }   
    }
}
