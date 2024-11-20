import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int b = sc.nextInt();
        int a = sc.nextInt();

        for(int i = b; i >= a; i-=2) {
            System.out.print(i + " ");
        }
    }
}