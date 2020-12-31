import java.util.Scanner;

public class PrimePaliAmstr {
    public static void main(String[] args){
        char choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter p for Prime.");
        System.out.println("Enter q for Palindrome.");
        System.out.println("Enter a for Amstrong.");
        String s = input.next();
        choice = s.charAt(0);

        switch(choice) {

        case 'p':
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter any number:");
            int numberToCheck=scan.nextInt();
            scan.close();
            for(int i=2;i<=numberToCheck/2;i++) {
                int temp = numberToCheck%i;
                if(temp==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(numberToCheck + " is a Prime Number");
            } else {
                System.out.println(numberToCheck + " is not a Prime Number");
            }   

        case 'q':
            Scanner scanTwo= new Scanner(System.in);
            System.out.println("Enter any number:");
            int numberToCheckPal=scanTwo.nextInt();
            scanTwo.close();  
            int reversedInteger = 0, remainder, originalInteger;
            originalInteger = numberToCheckPal;
            while( numberToCheckPal != 0 ) {
                remainder = numberToCheckPal % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                numberToCheckPal  /= 10;
            }
            if (originalInteger == reversedInteger) {
                System.out.println(originalInteger + " is a palindrome.");
            } else {
                System.out.println(originalInteger + " is not a palindrome.");
            }
            
        case 'a':
            Scanner scanThree= new Scanner(System.in);
            System.out.println("Enter any number:");
            int numberToCheckAmstr=scanThree.nextInt();
            scanThree.close();  
            int amsOriginalNumber, amsRemainder, amsResult = 0;
            amsOriginalNumber = numberToCheckAmstr;
            while (amsOriginalNumber != 0)
            {
                amsRemainder = amsOriginalNumber % 10;
                amsResult += Math.pow(amsRemainder, 3);
                amsOriginalNumber /= 10;
            }
            if(amsResult == numberToCheckAmstr) {
                System.out.println(numberToCheckAmstr + " is an Armstrong number.");
            } else {
                System.out.println(numberToCheckAmstr + " is not an Armstrong number.");
            }
        }
    }
}
