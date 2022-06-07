import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    static char[][] s;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        s = new char[n][n];
        star(0,0,n,false);
        
        for(int i = 0; i<n; i++){
            bw.write(s[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    public static void star(int x, int y, int n, boolean block){
        if(block == true){
            for(int i = x; i<x+n; i++){
                for(int j = y; j<y+n; j++){
                    s[i][j] = ' ';
                }
            }
            return;
        }
        if(n==1){
            s[x][y]='*';
            return;
        }
        
        int size = n/3;
        int c = 0;
        for(int i = x; i<x+n; i+=size){
            for(int j = y; j<y+n; j+=size){
                c++;
                if(c==5){
                    star(i,j,size,true);
                }
                else{
                    star(i,j,size,false);
                }
            }
        }
        
    }
}