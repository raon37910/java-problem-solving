import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int end = 5 * n;

        for(int i = n; i <= end; i+= n) {
            System.out.print(i + " ");
        }
    }
}