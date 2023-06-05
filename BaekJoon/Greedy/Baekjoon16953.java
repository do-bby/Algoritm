import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon16953 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        int cnt = 1;
        while(a!=b){
            String str = String.valueOf(b);
            if(a>b){
                cnt=-1;
                break;
            }
            if(b%2!=0 && str.charAt(str.length()-1) != '1'){
                cnt=-1;
                break;
            }
            if(b%2==0){
                b/=2;
            }
            else{
                str = str.substring(0,str.length()-1);
                b = Long.parseLong(str);
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}
