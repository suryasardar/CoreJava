public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 120;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Maximum is " + max);
    }
}
