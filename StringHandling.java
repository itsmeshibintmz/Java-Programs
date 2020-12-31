//Java program to Implement string handling functions.
public class StringHandling {
    public static void main(String args[]){ 
        //String Handling Functions
        //Function 1: String Length
        String s1="Hello"; 
        String s2="Welcome To Java"; 
        System.out.println("Length of String "+s1+" is: "+s1.length());  
        System.out.println("Length of String "+s2+" is: "+s2.length()); 

        //Function 2: String compare
        String s3="hello";
        String s4="hello"; 
        String s5="hemlo"; 
        String s6="flag";

        //This program shows the comparison between the various string. It is noticed that  
        //if s1 > s2, it returns a positive number  
        //if s1 < s2, it returns a negative number 
        //if s1 == s2, it returns 0

        System.out.println();
        System.out.println("Compare Results");
        System.out.println("----------------");
        System.out.println("Here if 1st string is greater than 2nd, the result will be a +ve number");
        System.out.println("If 1st string is lower than 2nd, the result will be -ve number, if both strings are equal, the result will be zero");
        System.out.println("Results are:");
        System.out.println("String 1 compared to String 2: "+s3.compareTo(s4)); 
        System.out.println("string 1 compared to String 3: " +s3.compareTo(s5)); 
        System.out.println("String 1 compared to String 4: " +s3.compareTo(s6)); 

        //Function 3: String concatenation
        System.out.println();
        System.out.println("String Concatenation");
        System.out.println("--------------------");
        String s7="Hello";
        s7=s7.concat(" How are you");
        System.out.println(s7);

        //Function 4: String is Empty or not
        String s8=""; 
        String s9="hello"; 
        System.out.println();
        System.out.println("String is Empty or not");
        System.out.println("----------------------");
        System.out.println("String 1: "+s8.isEmpty());      
        System.out.println("String 2: "+s9.isEmpty());     
        
        //Function 5: String toLowerCase
        System.out.println();
        System.out.println("String to lower Case");
        System.out.println("--------------------");
        String s10="HELLO HOW Are You";
        String s10Lower=s10.toLowerCase();
        System.out.println(s10Lower);

        //Function 6: String toupper Case
        System.out.println();
        System.out.println("String to Upper case");
        System.out.println("--------------------");
        String s11="hello how are you";  
        String s11upper=s11.toUpperCase();  
        System.out.println(s11upper);  
    }       
}
