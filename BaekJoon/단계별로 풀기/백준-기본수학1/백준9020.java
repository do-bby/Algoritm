import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        get_prime();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i <n; i++){
            int m = Integer.parseInt(br.readLine());
            int f = m/2;
            int s = m/2;
            
            while(true){
                if(prime[f] == false && prime[s] == false){
                    System.out.println(f + " " + s);
                    break;
                }
                f--;
                s++;
            }
            
        }
    }
    public static void get_prime(){
        prime[0]=prime[1]=true;
        for(int i = 2; i<=Math.sqrt(prime.length);i++){
            if(prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i){
                prime[j]=true;
            }
        }
    }
}