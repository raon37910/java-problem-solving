import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(check(i)) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean check(int num) {
        if(num % 3 == 0) {
            return true;
        }

        while (num > 0) {
            int x = num % 10;

            if(x == 3 || x == 6 || x == 9) {
                return true;
            }

            num /= 10;
        }

        return false;
    }
}