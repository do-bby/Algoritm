import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int m = 0;
        for(int i =0;i<=n;i++){
            int number = i;
            int sum = 0;
            while(number != 0){
                sum += number%10;
                number = number/10;
            }
            
            if(i+sum == n){
                m = i;                
                break;
            }
        }
        System.out.println(m);
    }
}