import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0);
        int temp1 = sc.nextInt();

        char c2 = sc.next().charAt(0);
        int temp2 = sc.nextInt();

        char c3 = sc.next().charAt(0);
        int temp3 = sc.nextInt();


        int cnt = 0;
        
        if(check(c1, temp1)) {
            cnt++;
        }

        if(check(c2, temp2)) {
            cnt++;
        }

        if(check(c3, temp3)) {
            cnt++;
        }

        System.out.println(cnt >= 2 ? "E" : "N");
    }

    public static boolean check(char c, int temp) {
        if(c == 'Y' && temp >= 37) {
            return true;
        }

        return false;
    }
}