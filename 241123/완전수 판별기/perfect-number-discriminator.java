import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(check(n) ? "P" : "N");
    }

    public static int calcSum(int num) {
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += num;
            }
        }

        return num;
    }

    public static boolean check(int num) {
        return calcSum(num) == num;
    }
}