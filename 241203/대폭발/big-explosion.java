import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int r;
    static int c;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        input();
        Pos cur = new Pos(r, c);
        Queue<Pos> q = new ArrayDeque<>();
        q.offer(cur);
        arr[cur.x][cur.y] = 1;

        for(int time = 1; time <= m; time++) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                Pos p = q.poll();
                for(int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j] * (int) Math.pow(2, time - 1);
                    int ny = p.y + dy[j] * (int) Math.pow(2, time - 1);

                    if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if(arr[nx][ny] == 1) continue;

                    arr[nx][ny] = 1;
                    q.offer(new Pos(nx, ny));
                }
                q.offer(new Pos(p.x, p.y));
            }
        }

        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1) answer++;
            }
        }
        System.out.println(answer);
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt()-1;
        c = sc.nextInt()-1;
        arr = new int[n][n];
    }
}

class Pos {
    int x;
    int y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}