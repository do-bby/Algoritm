import java.io.*;
public class Baekjoon15904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] UCPC = {'U','C','P','C'};
        int idx = 0;
        for(int i = 0; i<str.length();i++){
            if(UCPC[idx] == str.charAt(i)){
                idx++;
            }
            if(idx == 4){
                System.out.print("I love UCPC");
                return;
            }
        }
        System.out.print("I hate UCPC");
    }
}
