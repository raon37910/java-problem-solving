import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        printStar(n);
        System.out.println();
        printStar(n);
    }

    public static void printStar(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}