import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int cnt = 0;
        int i = 1;

        while(n > 1) {
            n /= i++;
            cnt++;
        }

        System.out.println(cnt);
    }
}