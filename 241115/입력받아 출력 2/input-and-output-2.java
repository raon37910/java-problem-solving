import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("-");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1 + s2);
    }
}