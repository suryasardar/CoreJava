 
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();   
        int a = 0, b = 1;

        System.out.print(a + " " + b);  

        for (int i = 1; i <= s - 2; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
