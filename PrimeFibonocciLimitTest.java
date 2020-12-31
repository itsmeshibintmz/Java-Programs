//Java program to print the prime numbers up to a limit and Fibonacci series up to a limit
public class PrimeFibonocciLimitTest {
    public static void main(String args[]) { 
        int limit = Integer.parseInt(args[0]);
        Fibonocci fib = new Fibonocci(limit);
        Prime pri = new Prime(limit);
        fib.findFibonocci();
        pri.findPrime();
    } 
} 

class Fibonocci {
    int fibonocciLimit;
    Fibonocci(int limitFibonocci) {
        fibonocciLimit = limitFibonocci;
    }
    void findFibonocci () {
        int term1 = 0, term2 = 1;
        System.out.print("First " + fibonocciLimit + " Fibonocci terms: ");
        for (int i = 1; i <= fibonocciLimit; ++i) {
            System.out.print(term1 + "  ");
            int sum = term1 + term2;
            term1 = term2;
            term2 = sum;
        }
    }
}

class Prime {
    int numberPrimeLimit;
    Prime(int primeLimit) {
        numberPrimeLimit = primeLimit;
    }
    void findPrime() {
        String  primeNumbers = "";
        for (int i = 1; i <= numberPrimeLimit; i++) { 		  	  
            int counter=0; 	  
            for(int number =i; number>=1; number--){
                if(i%number==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                primeNumbers = primeNumbers + i + " ";
            }	
        }	
        System.out.println();
        System.out.println();
        System.out.println("Prime numbers from 1 to "+numberPrimeLimit+" are :");
        System.out.println(primeNumbers);
    }
}
  
