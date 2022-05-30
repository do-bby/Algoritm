import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        for(int i =0;i<n;i++){
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j = 0; j<s.length(); j++){                
                for(int k =0; k<r;k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}