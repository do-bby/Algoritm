import java.io.*;
import java.util.Arrays;

public class Baekjoon1417 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int da = Integer.parseInt(br.readLine());
        int[] arr = new int[n-1];
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        if(n == 1){
            System.out.print(0);
            return;
        }
        while(true){
            Arrays.sort(arr);
            boolean f = true;
            if(da<=arr[arr.length-1]){
                da++;
                arr[arr.length-1]--;
                ans++;
                f = false;
            }
            if(f){
                break;
            }
        }
        System.out.print(ans);
    }
}
