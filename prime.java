import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.println("Enter how many numbers to be entered");
            int t = scn.nextInt();

            while(t>0){
                int n = scn.nextInt();
                if(n==1){
                    System.out.println("1 is not a prime number");
                } else {
                    boolean isPrime = true;
                    for (int i=2; i*i<= n; i++){
                        if (n % i == 0) {
                            System.out.println(n + " is not a prime number");
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) {
                        System.out.println(n + " is a prime number");
                    }
                }
                t=t-1;
            }
        }
    }
}
