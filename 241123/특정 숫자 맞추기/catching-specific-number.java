import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true)    {
            int n = sc.nextInt();

            if(n < 25) {
                System.out.println("Higher");
            } else if(n > 25) {
                System.out.println("Lower");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}