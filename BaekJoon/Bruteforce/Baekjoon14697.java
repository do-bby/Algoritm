package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14697 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int ans = 0;
        for(int i = 0; i<50;i++){
            for(int j = 0; j<50;j++){
                for(int k = 0; k<50; k++){
                    if(a*i+b*j+k*c == n){
                        ans = 1;
                        break;
                    }
                }
            }
        }
        System.out.print(ans);
    }

}
