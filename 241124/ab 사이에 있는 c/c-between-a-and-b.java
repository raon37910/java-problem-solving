import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = false;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for(int i = a; i <= b; i++) {
            if(i % c == 0) {
                result = true;
                break;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}