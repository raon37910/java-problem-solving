import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            int n = sc.nextInt();

            if(n == 0) {
                break;
            }

            System.out.println(n);
        }
    }
}