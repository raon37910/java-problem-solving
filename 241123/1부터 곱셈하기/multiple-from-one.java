import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int ans = 1;
        
        for(int i = 1; i <= 10; i++) {
            ans *= i;

            if(ans >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}