import java.util.Scanner;

public class Main {

    static final int BLANK = 0;

    static int n;
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for(int i = 0; i < 2; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            remove(s, e);
        }

        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if(arr[i] != BLANK) {
                cnt++;
            }
        }

        System.out.println(cnt);

        for(int i = 1; i <= n; i++) {
            if(arr[i] != BLANK) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void remove(int s, int e) {
        int[] temp = new int[n+1];

        for(int i = s; i <= e; i++) {
            arr[i] = BLANK;
        }

        int tempIndex = 1;
        for(int i = 1; i <= n; i++) {
            if(arr[i] != BLANK) {
                temp[tempIndex] = arr[i];
                tempIndex++;
            }
        }

        arr = temp;
    }

    public static void input() {
        n = sc.nextInt();
        arr = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}