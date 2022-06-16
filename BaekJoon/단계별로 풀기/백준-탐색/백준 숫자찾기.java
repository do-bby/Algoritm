import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
    
    static int[] arr;
    static int[] com;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        
        int n = Integer.parseInt(br.readLine());
        
        arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<m;i++){
            int result = BS(Integer.parseInt(st.nextToken()));
            if(result !=-1){
                System.out.print(1+" ");
            }
            else{
                System.out.print(0+" ");
            }
        }

    }
    public static int BS(int t){
        int left = 0;
        int right = arr.length-1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid]<t){
                left = mid+1;
            }
            else if(arr[mid]>t){
                right = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}