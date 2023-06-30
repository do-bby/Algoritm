package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14889 {
    static int n;
    static int[][] map;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n];
        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        combi(0,0);
        System.out.print(Min);

    }
    static void combi(int idx, int cnt){
        if(cnt == n/2){
            diff();
            return;
        }
        for(int i = idx; i<n;i++){
            if(!visit[i]){
                visit[i] = true;
                combi(i+1,cnt+1);
                visit[i] = false;
            }
        }
    }
    static void diff(){
        int start = 0;
        int link = 0;
        for(int i = 0; i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(visit[i] == true && visit[j] == true){
                    start += map[i][j];
                    start += map[j][i];
                }
                else if(visit[i] == false && visit[j] == false){
                    link += map[i][j];
                    link += map[j][i];
                }
            }
        }
        int val = Math.abs(start-link);
        if(val == 0){
            System.out.print(0);
            System.exit(0);
        }
        Min = Math.min(val,Min);
    }
}
