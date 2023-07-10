package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon19532 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<6;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ansx = 0;
        int ansy = 0;
        for(int i = -999;i<1000;i++){
            for(int j = -999;j<1000;j++){
                if((arr[0]*i+arr[1]*j == arr[2]) && (arr[3]*i+arr[4]*j == arr[5])){
                    ansx = i;
                    ansy = j;
                    break;
                }
            }
        }

        System.out.print(ansx+" "+ansy);

    }
}
