import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11497 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i<tc;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int j = 0; j<n;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int left = n-1;
            int right = 0;
            int[] nums = new int[n];
            for(int j = 0; j<n;j++){
                if(j%2==0){
                    nums[left--] = arr[j];
                }
                else{
                    nums[right++] = arr[j];
                }
            }
            int ans = Integer.MIN_VALUE;
            for(int j = 1; j<n;j++){
                ans = Math.max(ans,Math.abs(nums[j] - nums[j-1]));
            }
            ans = Math.max(ans,Math.abs(nums[0]-nums[n-1]));
            System.out.println(ans + " ");
        }
    }
}
