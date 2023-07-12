package Bruteforce;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon5618 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 1; i<=arr[0];i++){
            if(n == 2){
                if(arr[0]%i==0 && arr[1]%i==0){
                    System.out.println(i);
                }
            }
            else if(n == 3){
                if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
