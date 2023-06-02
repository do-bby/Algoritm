import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon1946 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n;i++){
            int m = Integer.parseInt(br.readLine());
            int[][] arr = new int[m][2];
            int cnt = 1;
            for(int j = 0; j<arr.length;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0];
                }
            });
            int temp = arr[0][1];
            for(int j = 1; j<arr.length;j++){
                if(temp>arr[j][1]){
                    temp = arr[j][1];
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
