import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[][] arr;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for(int i = 0; i < m; i++) {
            for(int k = 1; k <= n * n; k++) {
                int[] pos = findPos(k);
                int[] nextPos = findNextPos(pos);
                swap(pos, nextPos);
            }
        }

        print();
    }

    public static int[] findPos(int x) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == x) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {0, 0};
    }

    public static int[] findNextPos(int[] pos) {
        int x = pos[0];
        int y = pos[1];

        int[] nextPos = new int[2];
        int max = -1;

        for(int dir = 0; dir < 8; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(inRange(nx, ny) && arr[nx][ny] > max) {
                max = arr[nx][ny];
                nextPos = new int[]{nx, ny};
            }
        }

        return nextPos;
    }

    public static void swap(int[] pos1, int[] pos2) {
        int x1 = pos1[0];
        int y1 = pos1[1];

        int x2 = pos2[0];
        int y2 = pos2[1];

        int temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void print() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}