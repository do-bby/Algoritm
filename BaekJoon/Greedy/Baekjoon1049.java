import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1049 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] lines = new int[m];
        int[] line = new int[m];
        for(int i = 0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            lines[i] = Integer.parseInt(st.nextToken());
            line[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        Arrays.sort(lines);
        Arrays.sort(line);
        ans = Math.min((n/6+1)*lines[0],n*line[0]);
        ans = Math.min(ans,((n/6))*lines[0]+(n%6)*line[0]);
        System.out.print(ans);
    }
}
