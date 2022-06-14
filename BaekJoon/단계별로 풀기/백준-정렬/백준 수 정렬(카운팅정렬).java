import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] c = new int[10001]; 
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            c[Integer.parseInt(br.readLine())]++;
        }
        for(int i =1; i<c.length; i++){
            while(c[i]!=0){
                sb.append(i).append('\n');
                c[i]--;                
            }
        }
        System.out.println(sb);
    }
}