import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1969 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] str = new String[n];
        for(int i = 0; i<n;i++){
            str[i] = br.readLine();
        }
        int hd = 0;
        int max = 0;
        String ans = "";
        for(int i = 0; i<m;i++){
            int a = 0;
            int c = 0;
            int g = 0;
            int t = 0;
            for(int j = 0; j<n;j++){
                if(str[j].charAt(i) == 'A'){
                    a++;
                }
                else if(str[j].charAt(i) == 'C'){
                    c++;
                }
                else if(str[j].charAt(i) == 'G'){
                    g++;
                }
                else if(str[j].charAt(i) == 'T'){
                    t++;
                }
            }
            max = Math.max(a>c?a:c,g>t?g:t);
            hd += (n-max);
            if(max==a){
                ans ="A";
            }
            else if(max==c){
                ans ="C";
            }
            else if(max==g){
                ans ="G";
            }
            else if(max==t){
                ans ="T";
            }
            System.out.print(ans);
        }
        System.out.print("\n"+hd);
    }
}
