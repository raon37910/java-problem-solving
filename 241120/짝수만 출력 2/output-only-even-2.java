import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int b = sc.nextInt();
        int a = sc.nextInt();

        int i = b;

        while(i >= a) {
            System.out.print(i + " ");
            i -= 2;
        }
    }
}