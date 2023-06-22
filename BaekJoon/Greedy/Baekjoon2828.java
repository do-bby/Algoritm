import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int left = 0;
        int right = left+m-1;
        int ans = 0;
        for(int i = 0; i<j;i++){
            int apple = Integer.parseInt(br.readLine())-1;
            if(apple<left){
                int d = left-apple;
                ans+=d;
                left-=d;
                right-=d;
            }
            else if(apple>right){
                int d = apple-right;
                ans+=d;
                right+=d;
                left+=d;
            }
        }
        System.out.print(ans);
    }
}
