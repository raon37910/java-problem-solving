import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;

        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if(num >= 0 && num <= 200) {
                sum += num;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", (sum), ((double) sum / cnt));
    }
}