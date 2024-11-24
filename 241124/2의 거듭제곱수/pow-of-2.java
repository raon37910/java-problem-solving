import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = 1;
        int cnt = 0;

        while(x != n) {
            x *= 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}