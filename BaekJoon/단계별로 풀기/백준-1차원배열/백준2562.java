import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        for(int i =0; i <9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int m=arr[0];
        int index=0;
        for(int i = 1; i<arr.length;i++){            
            if(m<arr[i]){
                m=arr[i];
                index=i;
            }          
        }
        System.out.println(m);
        System.out.println(index+1);
    }
}