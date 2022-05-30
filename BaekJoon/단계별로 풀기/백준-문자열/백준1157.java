import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        String s = br.readLine();
        
        for(int i = 0; i<s.length(); i++){
            if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                arr[s.charAt(i)-'A']++;
            }
            else{
                arr[s.charAt(i)-'a']++;
            }            
        }
        int max = -1;
        char c ='?';
        for(int i =0; i<26;i++){
            if(max<arr[i]){
                max=arr[i];
                c = (char) (i+65);
            }
            else if(max==arr[i]){
                c='?';
            }
        }
        System.out.print(c);
        
    }
}