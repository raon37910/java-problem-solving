import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a <= b) {
            System.out.print(a + " ");

            if(a % 2 == 0) {
                a += 3;
            } else {
                a *= 2;
            }
        }
    }
}