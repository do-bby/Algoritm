import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = new String[n];
        for(int i =0; i < n; i++){
            strs[i] = br.readLine();
        }
        for(int i = 0; i < n; i++){
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j<strs[i].length(); j++){
                if(strs[i].charAt(j) == 'O'){
                    cnt++;
                }
                else{
                    cnt=0;
                }
                sum+=cnt;
            }
            
            System.out.println(sum);
        }
        
    }
}