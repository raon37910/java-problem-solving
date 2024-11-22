import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = 0;

        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if(num % 2 == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}