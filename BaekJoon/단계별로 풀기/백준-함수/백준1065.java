import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.print(number(n));
    }
    public static int number(int num){
        int cnt = 0;
        if(num<99){
            return num;
        }
        else{
            cnt=99;
            for(int i = 100; i<=num; i++){
                int h = i/100;
                int t = (i/10)%10;
                int o = i%10;
                if(o-t == t-h){
                    cnt++;
                }               
            }            
        }
        return cnt;
    }
}