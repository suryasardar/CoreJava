import java.util.*;

public class cal{

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("b zero icchavu");
            return 0;
        }
        return a / b;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        cal calc = new cal();
        while(true){
            System.out.println("Calculator options");
            System.out.println("1. Add Chedhama");
            System.out.println("2. Subtract Chedhama");
            System.out.println("3. Multiply Chedhama");
            System.out.println("4. Divide Chedhama");
            System.out.println("5. I will go back");
            System.out.println("Enter your choice: ");
            
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Ok Bye!");
                break;
            }

            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

double result = 0;
            switch (choice) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    break;
                case 3:
                    result = calc.multiply(num1, num2);
                    break;
                case 4:
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("Tappu");
                    break;
            }
            System.out.println("Result: " + result);
            System.out.println("");
            System.out.println(" ");

        }
    }
}