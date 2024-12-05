import java.util.Scanner;

public class Main {

    static int[][] arr;
    static int[][] mar;
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int m;
    static int t;

    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        input();

        for(int i = 0; i < t; i++) {
            move();
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                ans += mar[i][j];
            }
        }

        System.out.println(ans);
    }

    public static void move() {
        int[][] newMar = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mar[i][j] == 1) {
                    int max = 0;
                    int mx = -1;
                    int my = -1;

                    for(int dir = 0; dir < 4; dir++) {
                        int nx = i + dx[dir];
                        int ny = j + dy[dir];

                        if(!inRange(nx, ny)) {
                            continue;
                        }

                        if(max < arr[nx][ny]) {
                            mx = nx;
                            my = ny;
                            max = arr[nx][ny];
                        }
                    }

                    newMar[mx][my] += 1;
                }
            }
        }

        mar = newMar;
        remove();
    }

    public static void remove() {
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                if(mar[i][j] >= 2) {
                    mar[i][j] = 0;
                }
            }
        }
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();

        arr = new int[n][n];
        mar = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            mar[x][y] = 1;
        }
    }
}