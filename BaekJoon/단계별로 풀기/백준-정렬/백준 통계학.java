import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[8001];
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int m = 10000;
        int mo = 10000;
        for(int i =0;i<n;i++){
            int value = Integer.parseInt(br.readLine());
            sum+=value;
            arr[value + 4000]++;
            if(max<value){
                max = value;
            }
            if(min>value){
                min = value;
            }
        }
        int c = 0;
        int mom=0;
        boolean f = false;
        
        for(int i = min+4000; i<=max+4000; i++){
            if(arr[i]>0){
                if(c<(n+1)/2){
                    c+=arr[i];
                    m=i-4000;
                }
                if(mom<arr[i]){
                    mom=arr[i];
                    mo=i-4000;
                    f=true;
                }
                else if(mom==arr[i] && f ==true){
                    mo=i-4000;
                    f=false;
                }
            }            
        }
        System.out.println((int)Math.round((double)sum/n));
        System.out.println(m);
        System.out.println(mo);
        System.out.println(max-min);
        
    }
}