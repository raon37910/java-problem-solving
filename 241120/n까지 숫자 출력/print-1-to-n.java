import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int i = 1;

        while(i <= n) {
            System.out.print(i++ + " ");
        }
    }
}