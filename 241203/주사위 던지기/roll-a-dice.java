import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int r;
    static int c;
    static int[][] arr;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static int[] dice = {1, 2, 3}; // 위 정면 오른쪽
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        arr[r][c] = 7 - dice[0];

        for (int i = 0; i < m; i++) {
            char ch = sc.next().charAt(0);
            int d = charToInt(ch);
            int nx = r + dx[d];
            int ny = c + dy[d];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }

            rotateDice(d);
            r = nx;
            c = ny;
            arr[r][c] = 7 - dice[0];
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer += arr[i][j];
            }
        }

        System.out.println(answer);
    }

    public static int charToInt(char d) {
        if (d == 'L') {
            return 0;
        } else if (d == 'U') {
            return 1;
        } else if (d == 'R') {
            return 2;
        } else {
            return 3;
        }
    }

    public static void rotateDice(int d) {
        if (d == 0) {
            int tmp = dice[0];
            dice[0] = dice[2];
            dice[2] = 7 - tmp;
        } else if (d == 1) {
            int tmp = dice[0];
            dice[0] = dice[1];
            dice[1] = 7 - tmp;
        } else if (d == 2) {
            int tmp = dice[2];
            dice[2] = dice[0];
            dice[0] = 7 - tmp;
        } else {
            int tmp = dice[1];
            dice[1] = dice[0];
            dice[0] = 7 - tmp;
        }
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt() - 1;
        c = sc.nextInt() - 1;
        arr = new int[n][n];
    }
}