package Bruteforce;
import java.io.*;
public class Baekjoon1526 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for(int i = n;i>=4;i--){
            boolean c = true;
            int num = i;
            while(num!=0){
                if(num%10 == 4 || num%10 == 7){
                    num/=10;
                }
                else{
                    c = false;
                    break;
                }
            }
            if(c){
                ans = i;
                break;
            }
        }
        System.out.print(ans);

    }
}
