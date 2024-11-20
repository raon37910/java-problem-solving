import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        for(int i = n; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}