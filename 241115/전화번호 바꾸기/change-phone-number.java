import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("-");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        System.out.printf("%s-%s-%s", a, c, b);
    }
}