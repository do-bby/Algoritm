import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;               
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i <n; i ++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>(){
           public int compare(int[] a, int[] b){
               if(a[1] == b[1]){
                   return a[0]-b[0];
               }
               else{
                   return a[1]-b[1];
               }
           } 
        });
        for(int i =0; i<n;i++){
            for(int j = 0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}