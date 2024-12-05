import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};

    static int t;
    static int n;
    static int m;
    static int[][] marbleCnt;
    static List<Marble> marbles = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            n = sc.nextInt();
            m = sc.nextInt();

            marbles = new ArrayList<>();
            marbleCnt = new int[n+1][n+1];

            for(int j = 0; j < m; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                char d = sc.next().charAt(0);

                int dir = 0;
                if(d == 'U') dir = 0;
                else if(d == 'R') dir = 1;
                else if(d == 'L') dir = 2;
                else if(d == 'D') dir = 3;

                marbles.add(new Marble(x, y, dir));
            }

            for(int j = 1; j <= 2 * n; j++) {
                simulate();
            }
            
            System.out.println(marbles.size());
        }
    }

    public static void simulate() {
        moveAll();
        removeMarbles();
    }

    public static void moveAll() {
        for(int i = 0; i < marbles.size(); i++) {
            Marble nextM = moveMarble(marbles.get(i));
            marbles.set(i, nextM);
        }
    }

    public static Marble moveMarble(Marble mm) {
        int nx = mm.x + dx[mm.d];
        int ny = mm.y + dy[mm.d];

        if(inRange(nx, ny)) {
            return new Marble(nx, ny, mm.d);
        } else {
            return new Marble(mm.x, mm.y, 3 - mm.d);
        }
    }

    public static void removeMarbles() {
        ArrayList<Marble> tempList = new ArrayList<>();

        for(int i = 0; i < marbles.size(); i++) {
            marbleCnt[marbles.get(i).x][marbles.get(i).y]++;
        }

        for(int i = 0; i < marbles.size(); i++) {
            if(!collideOccurs(i)) {
                tempList.add(marbles.get(i));
            }
        }

        for(int i = 0; i < marbles.size(); i++) {
            marbleCnt[marbles.get(i).x][marbles.get(i).y]--;
        }

        marbles = tempList;
    }

    public static boolean collideOccurs(int targetIndex) {
        return marbleCnt[marbles.get(targetIndex).x][marbles.get(targetIndex).y] >= 2;
    }

    public static boolean inRange(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= n;
    }
}

class Marble {
    int x;
    int y;
    int d;

    public Marble(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
}