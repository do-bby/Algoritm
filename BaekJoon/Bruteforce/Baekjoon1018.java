package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1018 {
    public static boolean [][] arr;
    public static int min = 64;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for(int j = 0; j<m;j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }
                else{
                    arr[i][j] = false;
                }
            }
        }

        int r = n-7;
        int c = m-7;
        for(int i = 0; i<r;i++){
            for(int j = 0; j<c; j++){
                find(i,j);
            }
        }
        System.out.print(min);
    }
    public static void find(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int cnt = 0;
        boolean tf = arr[x][y];
        for(int i = x; i<end_x;i++){
            for(int j = y; j<end_y;j++){
                if(arr[i][j] != tf){
                    cnt++;
                }
                tf = (!tf);
            }
            tf = !tf;
        }
        cnt = Math.min(cnt,64-cnt);
        min = Math.min(min,cnt);
    }
}
