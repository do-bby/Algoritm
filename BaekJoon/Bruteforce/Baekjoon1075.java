package Bruteforce;
import java.io.*;
public class Baekjoon1075 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int f = Integer.parseInt(br.readLine());
        String num = n.substring(0,n.length()-2);
        for(int i = 0; i<100;i++){
            if(i<10){
                String zeronum = "0" + String.valueOf(i);
                int res = Integer.parseInt(num + zeronum);
                if(res%f==0){
                    System.out.print(zeronum);
                    break;
                }
            }
            else{
                String number = String.valueOf(i);
                int res = Integer.parseInt(num+number);
                if(res%f==0){
                    System.out.print(number);
                    break;
                }
            }
        }
    }
}
