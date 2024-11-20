import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a;

        while(i <= b) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}