import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of terms you want in the Fibonacci sequence:");
            int n = sc.nextInt();
            int a=0;
            int b=1;
            System.out.println("Fibonacci sequence:");
        
            for(int i =1; i<=n; i++){
                System.out.println(a);

                int temp = b;
                b = a + b;
                a = temp;
            }
        }
    }
}
