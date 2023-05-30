import java.io.*;
public class Baekjoon2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true){
            if(n%5==0){
                cnt+=n/5;
                break;
            }
            else if(n<0){
                System.out.print(-1);
                break;
            }
            n-=3;
            cnt++;
        }
        System.out.print(cnt);
    }
}
