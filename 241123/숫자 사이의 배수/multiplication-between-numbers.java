import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        double avg = 0;

        for(int i = a; i <= b; i++) {
            if(i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt++;
            }
        }

        avg = (double) sum / cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}