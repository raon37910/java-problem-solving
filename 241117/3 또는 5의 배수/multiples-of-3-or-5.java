import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String result1 = a % 3 == 0 ? "YES" : "NO";
        String result2 = a % 5 == 0 ? "YES" : "NO";

        System.out.println(result1);
        System.out.println(result2);
    }
}