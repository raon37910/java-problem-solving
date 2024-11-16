import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int min = a;
        min = Math.min(min, b);
        min = Math.min(min, c);

        System.out.println(min);
    }
}