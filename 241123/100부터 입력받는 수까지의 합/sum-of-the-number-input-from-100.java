import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0;

        for(int i = n; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}