import java.io.*;
public class Baekjoon1213 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int[] alpha = new int[26];
        for(int i = 0; i<st.length(); i++){
            alpha[st.charAt(i)-'A']++;
        }
        int n = 0;
        int m = 0;
        for(int i = 0; i<26; i++){
            if(alpha[i]%2 == 1){
                m = i;
                n++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if((n>1) || (st.length() % 2 == 0 && n>0)){
            sb.append("I'm Sorry Hansoo");
        }
        else{
            String ans = "";
            for(int i = 0; i<26;i++){
                for(int j = 0; j<alpha[i]/2; j++){
                    ans+=(char)(i+'A');
                }
            }
            String r = new StringBuilder(ans).reverse().toString();
            if(n == 1){
                ans+=(char)(m+'A');
            }
            sb.append(ans+r);
        }
        System.out.print(sb);
    }
}
