import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int n;
    static int[][] arr;
    static int r;
    static int c;
    static int m1;
    static int m2;
    static int m3;
    static int m4;
    static int dir;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        // print();

        // 1번 방향의 모든 좌표의 위치를 먼저 구한다.
        Pos[] m1Pos = new Pos[m1+1];
        m1Pos[0] = new Pos(r, c);

        for(int i = 1; i <= m1; i++) {
            Pos p = m1Pos[i-1];
            m1Pos[i] = new Pos(p.x - 1, p.y + 1);
        }

        // 2번 방향의 모든 좌표의 위치를 먼저 구한다.
        Pos[] m2Pos = new Pos[m2+1];
        m2Pos[0] = new Pos(m1Pos[m1].x , m1Pos[m1].y);

        for(int i = 1; i <= m2; i++) {
            Pos p = m2Pos[i-1];
            m2Pos[i] = new Pos(p.x - 1, p.y - 1);
        }

        // 3번 방향의 모든 좌표의 위치를 먼저 구한다
        Pos[] m3Pos = new Pos[m3+1];
        m3Pos[0] = new Pos(m2Pos[m2].x, m2Pos[m2].y);
        
        for(int i = 1; i <= m3; i++) {
            Pos p = m3Pos[i-1];
            m3Pos[i] = new Pos(p.x + 1, p.y - 1);
        }

        // 4번 방향의 모든 좌표의 위치를 먼저 구한다.
        Pos[] m4Pos = new Pos[m4+1];
        m4Pos[0] = new Pos(m3Pos[m3].x, m3Pos[m3].y);
        
        for(int i = 1; i <= m4; i++) {
            Pos p = m4Pos[i-1];
            m4Pos[i] = new Pos(p.x + 1, p.y + 1);
        }

        if(dir == 1) {
            // 시계 방향 회전인 경우
            // 1번 방향의 회전을 먼저 시작한다.
            Pos temp1Pos = m1Pos[0];
            int temp1Value = arr[temp1Pos.x][temp1Pos.y];

            for(int i = 0; i < m1; i++) {
                Pos p = m1Pos[i];
                Pos nextP = m1Pos[i+1];

                arr[p.x][p.y] = arr[nextP.x][nextP.y];
            }
            // 2번 방향의 회전을 시작한다.
            Pos temp2Pos = m2Pos[0];
            int temp2Value = arr[temp2Pos.x][temp2Pos.y];

            for(int i = 0; i < m2; i++) {
                Pos p = m2Pos[i];
                Pos nextP = m2Pos[i+1];

                arr[p.x][p.y] = arr[nextP.x][nextP.y];
            }

            // 3번 방향의 회전을 시작한다.
            Pos temp3Pos = m3Pos[0];
            int temp3Value = arr[temp3Pos.x][temp3Pos.y];

            for(int i = 0; i < m3; i++) {
                Pos p = m3Pos[i];
                Pos nextP = m3Pos[i+1];

                arr[p.x][p.y] = arr[nextP.x][nextP.y];
            }

            // 4번 방향의 회전을 시작한다.
            Pos temp4Pos = m4Pos[0];
            int temp4Value = arr[temp4Pos.x][temp4Pos.y];

            for(int i = 0; i < m4-1; i++) {
                Pos p = m4Pos[i];
                Pos nextP = m4Pos[i+1];

                arr[p.x][p.y] = arr[nextP.x][nextP.y];
            }

            arr[m4Pos[m4-1].x][m4Pos[m4-1].y] = temp1Value;
        } else {
            // 반시계 방향 회전인 경우
            // 1번 방향의 회전을 시작한다.
            Pos temp1Pos = m1Pos[m1];
            int temp1Value = arr[temp1Pos.x][temp1Pos.y];

            for(int i = m1; i >= 1; i--) {
                Pos p = m1Pos[i];
                Pos beforeP = m1Pos[i-1];

                arr[p.x][p.y] = arr[beforeP.x][beforeP.y];
            }
            // 2번 방향의 회전을 시작한다.
            Pos temp2Pos = m2Pos[m2];
            int temp2Value = arr[temp2Pos.x][temp2Pos.y];

            for(int i = m2; i >= 2; i--) {
                Pos p = m2Pos[i];
                Pos beforeP = m2Pos[i-1];

                arr[p.x][p.y] = arr[beforeP.x][beforeP.y];
            }
            arr[m2Pos[1].x][m2Pos[1].y] = temp1Value;

            // 3번 방향의 회전을 시작한다.
            Pos temp3Pos = m3Pos[m3];
            int temp3Value = arr[temp3Pos.x][temp3Pos.y];

            for(int i = m3; i >= 2; i--) {
                Pos p = m3Pos[i];
                Pos beforeP = m3Pos[i-1];

                arr[p.x][p.y] = arr[beforeP.x][beforeP.y];
            }
            arr[m3Pos[1].x][m3Pos[1].y] = temp2Value;

            // 4번 방향의 회전을 시작한다.
            Pos temp4Pos = m4Pos[m4];
            int temp4Value = arr[temp4Pos.x][temp4Pos.y];

            for(int i = m4; i >= 2; i--) {
                Pos p = m4Pos[i];
                Pos beforeP = m4Pos[i-1];

                arr[p.x][p.y] = arr[beforeP.x][beforeP.y];
            }

            arr[m4Pos[1].x][m4Pos[1].y] = temp3Value;
        }

        print();
    }


    public static void print() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input() {
        n = sc.nextInt();
        arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        r = sc.nextInt();
        c = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        dir = sc.nextInt();
    }
}

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}