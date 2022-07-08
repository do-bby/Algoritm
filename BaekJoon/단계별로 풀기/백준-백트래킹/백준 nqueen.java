import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static int arr[];
    public static int n;
    public static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        arr= new int[n];
        
        nqueen(0);
        System.out.println(count);
    }
    
    public static void nqueen(int depth){
        if(depth == n){
            count++;
            return;
        }
        for(int i = 0; i<n;i++){
            arr[depth] = i;
            if(possible(depth)){
                nqueen(depth+1);
            }
        }
    }
    public static boolean possible(int col){
        
        for(int i = 0; i<col; i++){
            if(arr[col] == arr[i]){
                return false;
            }
            
            else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }
}