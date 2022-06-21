import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        System.out.println(BC(n,k));
    }
    private static int BC(int a, int b){
        if(a == b || b == 0){
            return 1;
        }
        return BC(a-1,b-1) + BC(a-1,b);
    }
}