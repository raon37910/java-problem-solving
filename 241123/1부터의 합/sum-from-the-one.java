import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= 100; i++) {
            sum += i;

            if(sum >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}