import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            if(num % 2 == 1 && num % 3 == 0) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}