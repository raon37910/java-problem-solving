import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int min = a;
        min = Math.min(min, b);
        min = Math.min(min, c);

        int result1 = a == min ? 1 : 0;
        int result2 = a == b && b == c ? 1 : 0;

        System.out.println(result1 + " " + result2);
    }
}