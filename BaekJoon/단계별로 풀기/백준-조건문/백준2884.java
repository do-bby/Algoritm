import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if(b<45){
            a--;
            b=60-(45-b);
            if(a<0){
                a=23;
            }
            System.out.println(a + " " + b);
        }
        else{
            b=b-45;
            System.out.println(a + " " + b);
            
        }
    
   }
}