import java.util.Scanner;

public class ArraySortTest {
    public static void main(String[] args){
        int limit,temp=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the Array:");
        limit = s.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter the elements:");
        for (int i = 0; i < limit; i++) {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < limit; i++) {
            for (int j = i + 1; j < limit; j++) {
                if (array[i] > array[j])  {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Array in Ascending Order:");
        for (int i = 0; i < limit - 1; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[limit - 1]);
    }
}