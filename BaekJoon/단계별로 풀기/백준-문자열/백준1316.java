import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        
        int cnt=0;
        int n = Integer.parseInt(br.readLine());
        for(int i =0;i<n;i++){
            if(check() == true){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int p =0;
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            int n = s.charAt(i);
            
            if(p!=n){
                if(check[n-'a']==false){
                    check[n-'a']=true;
                    p=n;
                }
                else{
                    return false;
                }
            }
            else{
                continue;
            }            
        }
        return true;
    }
}