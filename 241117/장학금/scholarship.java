import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        if(score1 >= 90) {
            if(score2 >= 95) {
                System.out.println(100000);
            } else if(score >= 90) {
                System.out.println(50000);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}