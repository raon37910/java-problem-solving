import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = false;
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            if(1920 % i == 0 && 2880 % i == 0) {
                result = true;
                break;
            }
        }

        System.out.println(result ? "1" : "0");
    }
}