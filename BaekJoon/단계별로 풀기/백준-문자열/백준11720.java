import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String n = br.readLine();
        int sum = 0;
        for(int i = 0; i<x; i++){
            sum+=n.charAt(i)-48;
        }
        System.out.print(sum);
    }
}