import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        if(value >= 1.0) {
            System.out.println("High");
        } else if (value >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}