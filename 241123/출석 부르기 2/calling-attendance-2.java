import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true)    {
            int n = sc.nextInt();

            if(n == 1) {
                System.out.println("John");
            } else if(n == 2) {
                System.out.println("Tom");
            } else if(n == 3) {
                System.out.println("Paul");
            } else if(n == 4) {
                System.out.println("Sam");
            } else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}