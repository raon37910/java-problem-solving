import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // 공백 출력
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            
            // 별 출력
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}