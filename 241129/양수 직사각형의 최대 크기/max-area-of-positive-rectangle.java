import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        int ans = Integer.MIN_VALUE;

        for(int x1 = 0; x1 < n; x1++) {
            for(int y1 = 0; y1 < m; y1++) {
                for(int x2 = x1; x2 < n; x2++) {
                    for(int y2 = y1; y2 < m; y2++) {
                        if(check(x1, y1, x2, y2)) {
                            int sum = (x2 - x1 + 1) * (y2 - y1 + 1);
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }
        }

        System.out.println(ans == Integer.MIN_VALUE ? -1 : ans);
    }

    // 양수 직사각형인지 체크
    public static boolean check(int x1, int y1, int x2, int y2) {
        for(int i = x1; i <= x2; i++) {
            for(int j = y1; j <= y2; j++) {
                if(arr[i][j] <= 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}