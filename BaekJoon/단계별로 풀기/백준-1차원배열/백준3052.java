import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;                                    
        }
        int result = 0;
        
        for(int i = 0; i < 10; i++){
            int count = 0;
            for(int j = i+1; j < 10; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 0){
                result++;
            }
        }        
        System.out.println(result);
        
    }
}