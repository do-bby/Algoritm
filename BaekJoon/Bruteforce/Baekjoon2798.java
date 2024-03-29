package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for(int i = 0; i<n-2;i++){
            for(int j = i+1; j<n-1;j++){
                for(int k = j+1; k<n;k++){
                    int t = arr[i]+arr[j]+arr[k];
                    if(t == m){
                        max = t;
                        break;
                    }
                    if(t>max && t<m){
                        max = t;
                    }
                }
            }
        }
        System.out.print(max);
    }
}
