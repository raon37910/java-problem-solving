import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter(":");
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("%d:%d", (h+1), m);
    }
}