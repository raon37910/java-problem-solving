import java.util.Scanner;

public class Main {

    static int n;
    static int[][] arr;
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
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for (int width = 1; width <= n; width++) {
                    for(int height = 1; height <= n; height ++) {
                        ans = Math.max(ans, sumSquare(i, j, width, height));
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static int sumSquare(int x, int y, int width, int height) {
        int ans = 0;
        // 1번 방향으로 height 만큼 이동
        for(int i = 0; i < height; i++) {
            x--;
            y++;
            if(!inRange(x, y)) {
                return 0;
            }
            ans += arr[x][y];
        }
        // 2번 방향으로 width 만큼 이동
        for(int i = 0; i < width; i++) {
            x--;
            y--;
            if(!inRange(x, y)) {
                return 0;
            }
            ans += arr[x][y];
        }
        // 3번 방향으로 height 만큼 이동
        // 1번 방향으로 height 만큼 이동
        for(int i = 0; i < height; i++) {
            x++;
            y--;
            if(!inRange(x, y)) {
                return 0;
            }
            ans += arr[x][y];
        }
        // 4번 방향으로 width 만큼 이동
         for(int i = 0; i < width; i++) {
            x++;
            y++;
            if(!inRange(x, y)) {
                return 0;
            }
            ans += arr[x][y];
        }

        return ans;
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}