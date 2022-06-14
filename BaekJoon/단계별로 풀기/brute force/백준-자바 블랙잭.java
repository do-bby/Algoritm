import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());            
        }
        int result = se(num, n, m);
        System.out.println(result);
                
    }
    static int se(int num[], int n, int m){
        int result =0;
        for(int i = 0; i<n-2;i++){           
            for(int j = i+1;j<n-1;j++){
                for(int k =j+1;k<n;k++){
                    int temp = num[i]+num[j]+num[k];
                    
                    if(temp==m){
                        return temp;
                    }
                    if(result<temp && temp<m){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}