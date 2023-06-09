import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1343 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a="AAAA";
        String b="BB";
        str = str.replaceAll("XXXX",a);
        str = str.replaceAll("XX",b);
        if(str.contains("X")){
            System.out.print(-1);
        }
        else{
            System.out.print(str);
        }
    }
}
