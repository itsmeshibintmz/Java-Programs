//Java program to read n strings then to sort them and display the palindromes among them.
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of words you would like to enter");
        int numberOfWords = reader.nextInt();
        String words[] = new String[numberOfWords];
        reader.nextLine();
        System.out.println("Enter the words");
 
        for(int i = 0; i < numberOfWords; i++){
            words[i] = reader.nextLine();
        }
        reader.close();

       String sortedWords[] = sorter(words);
       stringPrinter(sortedWords);
       palindromeCheck(sortedWords);
       
    }

    static String[] sorter(String[] words) {
        int n = words.length;
        for(int i = 0; i < n-1; i++) {  
            for (int j = i+1; j < n; j++){  

                if(words[i].compareTo(words[j])>0){  
                
                String temp = words[i];  
                words[i] = words[j];  
                words[j] = temp;  
                }  
            }  
        }
        return words;
    }

    static void palindromeCheck(String[] words){
        for(int i = 0; i < words.length; i++){
            String rev = "";
            for(int j = words[i].length()-1; j >= 0; j--){
                rev += words[i].charAt(j);
            }
            if(words[i].equals(rev)){
                System.out.println(rev + " is a palindrome");
            }
        }
    }

    static void stringPrinter(String[] words){
        for(int i =0 ; i < words.length;i++){
            System.out.println(words[i]);
        }
    }
}
