import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;
        while(true)    {
            int age = sc.nextInt();

            if(age < 20 || age >= 30) {
                break;
            }

            sum += age;
            cnt++;
        }

        System.out.printf("%.2f", ((double) sum / cnt));
    }
}