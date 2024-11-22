import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 1;

        for(int i = 1; i <= b; i++) {
            if(i % a == 0) {
                answer *= i;
            }
        }

        System.out.println(answer);
    }
}