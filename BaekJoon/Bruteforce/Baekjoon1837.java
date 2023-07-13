package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1837 {
    public static boolean[] b = new boolean[1000001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int r = Integer.MAX_VALUE;
        for(int i = 2; i<1000001;i++){
            for(int j = i+i;j<1000001;j+=i){
                b[i] = true;
            }
        }
        for(int i = 2;i<=k;i++){
            int m = 0;
            for(int j = 0; j<str.length();j++){
                m = (m*10 + str.charAt(j)-'0')%i;
            }
            if(m == 0){
                r = i;
                break;
            }
        }
        if(r<k){
            System.out.println("BAD "+r);
        }
        else{
            System.out.println("GOOD");
        }
    }
}
