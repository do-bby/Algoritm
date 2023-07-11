package Bruteforce;
import java.io.*;
public class Baekjoon10448 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[45];
        for(int i = 1; i<45;i++){
            arr[i] = i*(i+1)/2;
        }
        for(int i = 0; i<t;i++){
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j = 1; j<45;j++){
                for(int k = 1; k<45;k++){
                    for(int z = 1; z<45;z++){
                        int sum = arr[j]+arr[k]+arr[z];
                        if(sum == n){
                            result = 1;
                            break;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
