import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num=sc.nextInt();

        int temp=Num;
        if(Num>0){
            int rev=0;
            while(Num>0){
                int rem=Num%10;
                rev=rev*10+rem;
                Num=Num/10;
            }
            if(rev==temp){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}