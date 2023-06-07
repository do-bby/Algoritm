import java.io.*;
public class Baekjoon2847 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for(int i = n-2; i>=0; i--){
            int h = arr[i+1];
            int l = arr[i];
            if(l>=h){
                sum+=l-(h-1);
                arr[i] = h-1;            }
        }
        System.out.print(sum);
    }
}
