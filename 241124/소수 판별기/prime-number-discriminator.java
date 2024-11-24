import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = true;
        int n = sc.nextInt();

        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                result = false;
                break;
            }
        }

        System.out.println(result ? "P" : "C");
    }
}