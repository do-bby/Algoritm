import java.io.*;
public class Baekjoon5585 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 1000-n;
        int cnt = 0;
        int[] coin = {500,100,50,10,5,1};
        for(int i = 0; i<coin.length;i++){
            if(m/coin[i]>0){
                cnt+=m/coin[i];
                m%=coin[i];
            }
        }
        System.out.print(cnt);
    }
}
