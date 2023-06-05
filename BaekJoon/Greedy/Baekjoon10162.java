import java.io.*;
public class Baekjoon10162 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;
        if(t>=300){
            a = t/300;
            t -= 300*a;
        }
        if(t>=60){
            b = t/60;
            t -= 60*b;
        }
        if(t%10!=0){
            System.out.print(-1);
            System.exit(0);
        }
        else{
            c = t/10;
            System.out.print(a+" "+b+" "+c);
        }
    }
}
