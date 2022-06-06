import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = factorial(n);
        System.out.print(sum);
    }
    public static int factorial(int a){
        if(a<=1) return 1;
        return a*factorial(a-1);
    }
}