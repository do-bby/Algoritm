import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(str2);
        
        h+=m2/60;
        m+=m2%60;
        
        if(m>59){
            h+=1;
            m-=60;
        }
        if(h>23){
            h-=24;
        }
        System.out.println(h + " " + m);
        
    }
}