import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = false;
        int n = sc.nextInt();

        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                result = true;
                break;
            }
        }

        System.out.println(result ? "C" : "N");
    }
}