// 2. WAP to check the given number is strong or not.

import java.util.Scanner;
public class Strongnumber {
     
    public int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Strongnumber obj = new Strongnumber();   

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += obj.factorial(digit);   
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }

        scanner.close();
    }
}