import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                    
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;           
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n-1]);
    }
}