import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr;
        for(int i =0; i<c;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int n =Integer.parseInt(st.nextToken());
            
            arr = new int[n];
            double sum = 0;
            for(int j = 0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());               
                sum+=arr[j];
            }
            double avg = sum/n;
            double cnt = 0;
            
            for(int j = 0; j<n; j++){
                if(arr[j]>avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
        
    }
}