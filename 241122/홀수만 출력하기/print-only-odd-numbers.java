import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            if(x % 2 == 1 &&  x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}