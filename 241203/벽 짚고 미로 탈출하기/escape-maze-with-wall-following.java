import java.util.Scanner;

public class Main {

    static int n;
    static int r;
    static int c;
    static int[][] arr;
    static boolean[][][] visited;
    //                         우       하       좌        상
    static int[][] deltas = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 시계방향
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        int d = 0; // 방향
        int time = 0;

        do {
            // 현재 위치에 같은 방향으로 온 적이 있다면 탈출이 불가능하다.
            if (visited[r][c][d]) {
                System.out.println(-1);
                return;
            }
            // 방문 표시
            visited[r][c][d] = true;

            int nx = r + deltas[d][0];
            int ny = c + deltas[d][1];

            // 바라보고 있는 방향에 벽이 있을 경우 반시계 회전
            if (wall(nx, ny)) {
                d = (d - 1 + 4) % 4;
            }
            // 바라보고 있는 방향이 격자 밖일 경우
            else if (!check(nx, ny)) {
                r = nx;
                c = ny;
                time++;
            }
            // 바라 보는 방향으로 이동, 바로 앞이 격자가 아님
            else {
                //그 방향으로 이동했다고 가정할 때 오른쪽 벽이 존재하는지 여부
                int rx = nx + deltas[(d + 1) % 4][0];
                int ry = ny + deltas[(d + 1) % 4][1];

                //오른쪽에 벽이 있다면 해당 방향으로 이동 가능
                if (wall(rx, ry)) {
                    r = nx;
                    c = ny;
                    time++;
                }
                //오른쪽에 벽이 없다면 2칸 이동 후 시계방향으로 바꿈
                else {
                    r = rx;
                    c = ry;
                    d = (d + 1) % 4;
                    time += 2;
                }
            }
        } while (check(r, c));

        System.out.print(time);
    }

    // 갈 수 있는 곳인지
    public static boolean check(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    // 벽이 있는지 없는지
    public static boolean wall(int x, int y) {
        return check(x, y) && arr[x][y] == 1;
    }

    public static void input() {
        n = sc.nextInt();
        r = sc.nextInt() - 1;
        c = sc.nextInt() - 1;
        arr = new int[n][n];
        visited = new boolean[n][n][4];

        for (int i = 0; i < n; i++) {
            String in = sc.next();
            for (int j = 0; j < n; j++) {
                if (in.charAt(j) == '.') {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
    }
}