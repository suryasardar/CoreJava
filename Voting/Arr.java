import java.util.*;

public class Arr{
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int s=sc.nextInt();
       int fac=1;
       for(int i=1; i<=s; i++){
             fac*=i;
       }
       System.out.println(fac);
}
}
 