import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}