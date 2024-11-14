import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double ft = sc.nextDouble();
        System.out.printf("%.1f", ft * 30.48);
    }
}