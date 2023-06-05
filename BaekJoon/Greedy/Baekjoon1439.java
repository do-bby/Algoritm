import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str,"1");
        StringTokenizer st0 = new StringTokenizer(str,"0");
        System.out.print(Math.min(st1.countTokens(),st0.countTokens()));
    }
}
