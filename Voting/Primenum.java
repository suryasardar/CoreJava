import java.util.*;
public class Primenum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
         
        for(int i=2; i<=s/2; i++){
           if(s%i==0){
               System.out.println("Not Prime");
               return;
           }else{
               System.out.println("Prime");
               return;
           }
        }
        
    }
}