import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        int i = 3;

        while(i <= n) {
            System.out.print(i + " ");
            i+=3;
        }
    }
}