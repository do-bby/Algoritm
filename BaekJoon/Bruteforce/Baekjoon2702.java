package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2702 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int lcm = 0;
            int gcd = 0;
            gcd = gcd(a,b);
            lcm = (a*b)/gcd;
            System.out.print(lcm+" "+gcd);
            System.out.println();
        }
    }
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
