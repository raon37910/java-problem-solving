import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i+=2) {
            System.out.print(i + " ");
        }
    }
}