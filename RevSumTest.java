//Java program to accept a number and then to find the reverse of the number and sum of its digits.
public class RevSumTest {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        RevSum rev = new RevSum(number);
        rev.calculateReverse();
        rev.calculateSumOfDigits();
    }
}

class RevSum {
    int reverse =0 ,numberToFind,sumOfDigit,numberToFindSum;
    RevSum(int numberToRev) {
        numberToFind = numberToRev;
        numberToFindSum = numberToRev;
    }
    void calculateReverse() {
        while(numberToFind!=0) {
            int digit = numberToFind % 10;
            reverse = reverse * 10 + digit;
            numberToFind /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
    }
    void calculateSumOfDigits() {
        while(numberToFindSum > 0)
        {
            int numbers = numberToFindSum % 10;
            sumOfDigit = sumOfDigit + numbers;
            numberToFindSum = numberToFindSum / 10;
        }
        System.out.println("Sum of Digits:"+sumOfDigit);
    }
}
