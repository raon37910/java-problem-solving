import java.util.Scanner;

public class Main {

    static int[][] arr;
    static int n;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();
        arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = 0; j < n - 2; j++) {
                // System.out.println("temp: " + select(i, j));
                ans = Math.max(select(i, j), ans);
            }
        }

        System.out.println(ans);
    }

    public static int select(int row, int col) {
        int count = 0;

        for(int i = row; i < row + 3; i++) {
            for(int j = col; j < col + 3; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}