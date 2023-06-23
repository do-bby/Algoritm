package Bruteforce;
import java.io.*;
public class Baekjoon1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(num(n));
    }
    public static int num(int number){
        int cnt = 0;
        if(number<100){
            return number;
        }
        else{
            cnt = 99;
            for(int i = 100; i<=number;i++){
                int h = i/100;
                int t = (i/10)%10;
                int o = i%10;
                if((h-t)==(t-o)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
