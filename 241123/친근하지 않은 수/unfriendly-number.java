import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}