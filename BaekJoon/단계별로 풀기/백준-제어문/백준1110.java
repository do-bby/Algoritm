import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c =0;
        int m = n;
        do{
            n=((n%10)*10) + (((n/10) + (n%10)) % 10);
            c++;
        }while(m != n);
        System.out.println(c);
    }
}