import java.util.Scanner;
class AddMatrix{
    public static void main(String args[]) {
        int row, coloumn,i,j;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of rows");
        row = in.nextInt();
        
        System.out.println("Enter the number columns");
        coloumn = in.nextInt();
        
        int matrixOne[][] = new int[row][coloumn];
        int matrixTwo[][] = new int[row][coloumn];
        int resultMatrix[][] = new int[row][coloumn];
        
        System.out.println("Enter the elements of matrix1");
        
        for ( i= 0 ; i < row ; i++ ) { 
        
            for ( j= 0 ; j < coloumn ;j++ ) {
                matrixOne[i][j] = in.nextInt();
        }
        System.out.println();
        }

        System.out.println("Enter the elements of matrix2");
        
        for ( i= 0 ; i < row ; i++ ) {
        
            for ( j= 0 ; j < coloumn ;j++ ) {
                matrixTwo[i][j] = in.nextInt();
            }
        System.out.println();
        }
        
        for ( i= 0 ; i < row ; i++ ) {
            for ( j= 0 ; j < coloumn ;j++ ) {
                resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j] ; 
            }
        }
        System.out.println("Sum of Matrices:");

        for ( i= 0 ; i < row ; i++ ) { 
            for ( j= 0 ; j < coloumn ;j++ ){
                System.out.print(resultMatrix[i][j]+"\t");
            }
        System.out.println();
        }             
    }
}
