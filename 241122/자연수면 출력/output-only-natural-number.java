import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > 0) {
            for(int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            System.out.println(0);
        }

    }
}