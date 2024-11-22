import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
    }
}