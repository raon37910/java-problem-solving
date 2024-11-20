import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}