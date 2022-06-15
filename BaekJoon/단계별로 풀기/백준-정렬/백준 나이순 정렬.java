import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }
        Arrays.sort(str, new Comparator<String[]>(){
            public int compare(String[] a, String[] b){
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n;i++){
            sb.append(str[i][0]).append(' ').append(str[i][1]).append('\n');

        }
        System.out.println(sb);
    }
}