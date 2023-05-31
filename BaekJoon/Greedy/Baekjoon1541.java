import java.io.*;
public class Baekjoon1541 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");
        int ans = 0;
        for(int i = 0; i<str.length;i++){
            String[] str2 = str[i].split("\\+");
            int sum = 0;
            for(int j = 0; j<str2.length;j++){
                sum+=Integer.parseInt(str2[j]);
            }
            if(i == 0){
                ans+=sum;
            }
            else{
                ans-=sum;
            }
        }
        System.out.print(ans);
    }
}
