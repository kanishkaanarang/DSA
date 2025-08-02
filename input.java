
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try 
            (Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.nextLine());
            // if same program me do type ke input lene hai toh use parse
            String name = sc.nextLine();
            System.out.println("hello " + name);
    
            for (int i = 0; i<=n; i++ ){
                System.out.println(i);
            }
            sc.close();
        }
        
    }
}
