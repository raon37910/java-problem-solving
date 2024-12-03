import java.io.*;
import java.util.*;

public class Main {

    static final int UP = 0;
    static final int DOWN = 1;
    static final int LEFT = 2;
    static final int RIGHT = 3;
    static final int SNAKE = 1;
    static final int APPLE = 2;

    static int N;   // 격자 크기
    static int M;   // 사과의 개수
    static int K;   // 뱀의 방향 변환 횟수
    static int[][] arr;
    static int[][] apples;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Deque<int[]> snake;
    static int time;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        apples = new int[M][2];
        snake = new ArrayDeque<>();
        // 사과 자리 입력
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            arr[x][y] = APPLE;
        }

        arr[0][0] = SNAKE;
        snake.addFirst(new int[]{0, 0});

        for (int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char direction = st.nextToken().charAt(0);
            int amount = Integer.parseInt(st.nextToken());
            int directionToInt = getDirection(direction);

            boolean isGameOver = false;
            while (amount-- > 0 && !isGameOver) {
                time++;
                isGameOver = simulate(directionToInt);
            }

            if (isGameOver) {
                break;
            }
        }

        sb.append(time);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static int getDirection(char direction) {
        if (direction == 'U') {
            return UP;
        }
        if (direction == 'D') {
            return DOWN;
        }
        if (direction == 'L') {
            return LEFT;
        }

        return RIGHT;
    }

    private static boolean simulate(int direction) {
        int nx = dx[direction] + snake.peekFirst()[0];
        int ny = dy[direction] + snake.peekFirst()[1];

        if (inRange(nx, ny)) {
            // 다음 칸이 사과일 때
            if (isApple(nx, ny)) {
                // 사과일때 nx, ny를 넣어
                snake.addFirst(new int[]{nx, ny});
                arr[nx][ny] = SNAKE;
                return false;
            }

            if (isBlank(nx, ny) || Arrays.equals(snake.peekLast(), new int[]{nx, ny})) {
                // 다음 칸이 빈 칸일 때
                int[] tail = snake.pollLast();
                arr[tail[0]][tail[1]] = 0;
                snake.addFirst(new int[]{nx, ny});
                arr[nx][ny] = SNAKE;
                return false;
            }
        }

        return true;
    }

    private static boolean isApple(int x, int y) {
        return arr[x][y] == APPLE;
    }

    private static boolean isBlank(int x, int y) {
        return arr[x][y] == 0;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}