import java.io.*;
public class Baekjoon14916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(n>0){
            if(n%5==0){
                cnt+=n/5;
                break;
            }
            n-=2;
            cnt++;
        }
        if(n<0){
            System.out.print(-1);
        }
        else{
            System.out.print(cnt);
        }
    }
}
