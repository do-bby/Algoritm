import java.io.*;
import java.util.Arrays;

public class Baekjoon10610 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] num = new int[10];
        int t = 0;
        for(int i = 0; i<s.length();i++){
            int n = Integer.parseInt(s.substring(i,i+1));
            num[n]++;
            t+=n;
        }
        if(!s.contains("0") || t%3!=0){
            System.out.print(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 9;i>=0;i--){
            while(num[i]>0){
                sb.append(i);
                num[i]--;
            }
        }
        System.out.print(sb.toString());
    }
}
