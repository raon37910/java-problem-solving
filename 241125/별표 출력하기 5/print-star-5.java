import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                printStar(i);
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void printStar(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}