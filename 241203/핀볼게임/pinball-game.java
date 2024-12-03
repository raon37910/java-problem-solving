import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int n, arr[][] = new int[100][100], dir[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}}, res;
    
    public static void main(String[] args) throws IOException{
        n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }        
        solution();
    }

    static void solution(){
        for(int k=0; k<n; k++){
            move(0, k, dir[0]);
            move(n-1, k, dir[1]);
            move(k, 0, dir[2]);
            move(k, n-1, dir[3]);
        }
        System.out.println(res);
    }

    static void move(int i, int j, int[] d){
        int[] td = d.clone();
        int cnt = 1;
        while(i >= 0 && i < n && j >= 0 && j < n){
            if(arr[i][j] != 0) changeDir(i, j, td);
            i += td[0];
            j += td[1];
            cnt++;
        }
        res = Math.max(res, cnt);
    }

    static void changeDir(int i, int j, int[] td){
        if(arr[i][j] == 1){ // /
            if(td[0] == 1 && td[1] == 0){ // 하
                // 좌
                td[0] = 0;
                td[1] = -1;
            }
            else if(td[0] == -1 && td[1] == 0){ // 상
                // 우
                td[0] = 0;
                td[1] = 1;
            }
            else if(td[0] == 0 && td[1] == 1){ // 우
                // 상
                td[0] = -1;
                td[1] = 0;
            }
            else if(td[0] == 0 && td[1] == -1){ // 좌
                // 하
                td[0] = 1;
                td[1] = 0;
            }
        }
        else if(arr[i][j] == 2){ // \
            if(td[0] == 1 && td[1] == 0){ // 하
                // 우
                td[0] = 0;
                td[1] = 1;
            }
            else if(td[0] == -1 && td[1] == 0){ // 상
                // 좌
                td[0] = 0;
                td[1] = -1;
            }
            else if(td[0] == 0 && td[1] == 1){ // 우
                // 하
                td[0] = 1;
                td[1] = 0;
            }
            else if(td[0] == 0 && td[1] == -1){ // 좌
                // 상
                td[0] = -1;
                td[1] = 0;
            }
        }
    }
}