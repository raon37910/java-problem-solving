import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int q;
    static int[][] arr;
    // 상우하좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        // print();

        for(int i = 0; i < q; i++) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            shift(r1-1, c1-1, r2-1, c2-1);
            changeArea(r1-1, c1-1, r2-1, c2-1);
        }

        print();
    }

    public static void changeArea(int r1, int c1, int r2, int c2) {
        int[][] copyArr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                copyArr[i][j] = arr[i][j];
            }
        }

        for(int i = r1; i <= r2; i++) {
            for(int j = c1; j <= c2; j++) {
                int sum = copyArr[i][j];
                int cnt = 1;

                for(int dir = 0; dir < 4; dir++) {
                    int nx = i + dx[dir];
                    int ny = j + dy[dir];

                    if(inRange(nx, ny)) {
                        sum += copyArr[nx][ny];
                        cnt++;
                    }
                }

                arr[i][j] = sum / cnt;
            }
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void shift(int r1, int c1, int r2, int c2) {
        // r1인 행을 오른쪽으로 한칸 이동
        int temp1 = arr[r1][c2];
        for(int i = c2; i >= c1 + 1; i--) {
            arr[r1][i] = arr[r1][i-1];
        }
        
        // c2인 열을 아래쪽으로 한칸 이동
        int temp2 = arr[r2][c2];
        for(int i = r2; i >= r1 + 2; i--) {
            arr[i][c2] = arr[i-1][c2];
        }

        // r2인 행을 왼쪽으로 한칸 이동
        int temp3 = arr[r2][c1];
        for(int i = c1; i <= c2 - 2; i++) {
            arr[r2][i] = arr[r2][i+1];
        }

        // c1인 열을 위쪽으로 한칸 이동
        int temp4 = arr[r1][c1];
        for(int i = r1; i <= r2 - 2; i++) {
            arr[i][c1] = arr[i+1][c1];
        }

        arr[r1+1][c2] = temp1;
        arr[r2][c2-1] = temp2;
        arr[r2-1][c1] = temp3;
        arr[r1][c1+1] = temp4;
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void print() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}