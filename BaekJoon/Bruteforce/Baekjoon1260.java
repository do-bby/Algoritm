package Bruteforce;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {
    static int[][] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];
        for(int i = 0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        check = new boolean[N+1];
        dfs(V);
        System.out.println();
        check = new boolean[N+1];
        bfs(V);
        System.out.println();
    }
    private static void dfs(int v){
        check[v] = true;
        System.out.print(v+" ");
        if(v == arr.length){
            return ;
        }
        for(int i = 1; i<arr.length;i++){
            if(arr[v][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start);
        check[start] = true;
        System.out.print(start + " ");
        while(!q.isEmpty()){
            int n = q.poll();
            for(int i = 1; i<arr.length;i++){
                if(arr[n][i] == 1 && !check[i]){
                    check[i] = true;
                    System.out.print(i+ " ");
                    q.offer(i);
                }
            }
        }
    }
}
