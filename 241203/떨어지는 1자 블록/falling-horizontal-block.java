import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int k;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for(int row = n; row >= 1; row--) {
            boolean flag = true;

            for(int col = k; col <= k + m - 1; col++) {
                if(arr[row][col] == 1) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                for(int col = k; col <= k + m - 1; col++) {
                    arr[row][col] = 1;
                }
                break;
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}