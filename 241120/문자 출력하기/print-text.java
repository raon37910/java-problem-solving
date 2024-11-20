import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char c = sc.nextLine().charAt(0);

        for(int i = 0; i < 8; i++) {
            System.out.print(c);
        }
    }
}