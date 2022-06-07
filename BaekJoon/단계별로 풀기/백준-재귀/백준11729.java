import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        bw.write((int) (Math.pow(2,n) - 1) + "\n");
        
        Hanoi(n,1,2,3);
        
        bw.flush();
        bw.close();
        
    }
    public static void Hanoi(int n, int s, int m, int t) throws IOException{
        if(n==1){
            bw.write(s+" "+t+"\n");
            return;
        }
        Hanoi(n-1,s,t,m);
        bw.write(s+" "+t+"\n");
        Hanoi(n-1,m,s,t);
    }
}