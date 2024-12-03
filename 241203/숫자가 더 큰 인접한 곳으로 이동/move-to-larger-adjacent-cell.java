import java.util.Scanner;

public class Main {

    static int n;
    static int r;
    static int c;
    static int [][] arr;
    static Scanner sc = new Scanner(System.in);
    // 상하좌우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        input();
        Pos cur = new Pos(r, c);

        while(true) {
            System.out.print(arr[cur.x][cur.y] + " ");

            int maxValue = arr[cur.x][cur.y];
            int curX = cur.x;
            int curY = cur.y;

            for(int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                if(nx < 1 || nx > n || ny < 1 || ny > n) {
                    continue;
                }

                if(arr[nx][ny] > maxValue) {
                    maxValue = arr[nx][ny];
                    cur = new Pos(nx, ny);
                    break;
                }
            }

            if(curX == cur.x && curY == cur.y) {
                break;
            }
        }
    }

    public static void input() {
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
