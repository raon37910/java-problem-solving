import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = b; i >= a; i--) {
            System.out.print(i + " ");
        }
    }
}