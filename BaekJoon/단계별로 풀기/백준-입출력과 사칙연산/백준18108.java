import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = 543;
        String str = br.readLine();
        int y = Integer.parseInt(str);
        
        System.out.println(y-x);
        
        
        
    }
}