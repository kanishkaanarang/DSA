

import java.util.Scanner;

public class allprimes {
   public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter start of the range");
        int low = sc.nextInt();
        System.out.println("enter end of the range");
        int high = sc.nextInt();

        for(int i = low; i <= high; i++) {
            if(i==0 || i==1) {
                continue;
            }
            
            boolean isPrime = true;
            for(int j=2; j*j<=i; j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                System.out.println(i);
            }
        }}
    } 
}
