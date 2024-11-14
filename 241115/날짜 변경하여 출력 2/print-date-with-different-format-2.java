import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("-");
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("%d.%d.%d", y, m, d);
    }
}