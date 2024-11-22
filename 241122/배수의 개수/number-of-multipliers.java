import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt3 = 0;
        int cnt5 = 0;

        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if(num % 3 == 0) {
                cnt3++;
            } 
            
            if(num % 5 == 0) {
                cnt5++;
            }
        }

        System.out.println(cnt3 + " " + cnt5);
    }
}