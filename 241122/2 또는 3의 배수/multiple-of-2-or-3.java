import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 || i % 3 == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}