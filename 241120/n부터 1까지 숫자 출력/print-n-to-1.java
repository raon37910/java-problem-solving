import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int i = n;

        while (i >= 1) {
            System.out.print(i-- + " ");
        }
    }
}