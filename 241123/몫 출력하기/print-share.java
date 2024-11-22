import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = 0;
        while(true)    {
            if(cnt >= 3) {
                break;
            }
            
            int n = sc.nextInt();

            if(n % 2 == 0) {
                System.out.println(n / 2);
                cnt++;
            }
        }
    }
}