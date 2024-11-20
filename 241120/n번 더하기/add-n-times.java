import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int n = sc.nextInt();


        for(int i = 0; i < n; i++) {
            a += n;
            System.out.println(a);
        }
    }
}