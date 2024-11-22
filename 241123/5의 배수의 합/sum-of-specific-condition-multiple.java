import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i = a; i <= b; i++) {
            if(i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}