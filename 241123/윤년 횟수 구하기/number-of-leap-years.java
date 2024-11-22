import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if(checkYear(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean checkYear(int year) {
        if(year % 4 == 0){
            if(year % 400 != 0 && year % 100 == 0)
                return false;
            else
                return true;
        }

        return false;
    }
}