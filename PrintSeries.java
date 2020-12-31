//Java program to print the series
//P
//Pr
//Pro
//Prog
//Progr…

public class PrintSeries {
    public static void main(String[] args) {
        char word[] = new char[]{'P','r','o','g','r','a','m'};
        for(int i = 0; i < word.length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(word[j]);
            }
            System.out.println("");
        }
    }
}
