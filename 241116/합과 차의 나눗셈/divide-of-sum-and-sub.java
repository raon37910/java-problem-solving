import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = (double) (a + b) / (a - b);
        System.out.printf("%.2f\n", result);
    }
}