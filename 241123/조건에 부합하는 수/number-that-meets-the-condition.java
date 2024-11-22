import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            if(checkNumber(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean checkNumber(int n) {
        if(n % 2 == 0 && n % 4 != 0) {
            return false;
        }

        if((n / 8) % 2 == 0) {
            return false;
        }

        if(n % 7 < 4) {
            return false;
        }

        return true;
    }
}