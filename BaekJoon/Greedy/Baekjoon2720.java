import java.io.*;
public class Baekjoon2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t;i++){
            int m = Integer.parseInt(br.readLine());
            int q = m/25;
            m %= 25;
            int d = m/10;
            m %= 10;
            int n = m/5;
            m %= 5;
            int p = m;
            System.out.print(q+" "+d+" "+n+" "+p);
        }
    }
}
