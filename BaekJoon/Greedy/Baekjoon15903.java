import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon15903 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        PriorityQueue<Long> q = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            q.add(Long.parseLong(st.nextToken()));
        }
        for(int i = 0; i<m;i++){
            long a = q.poll();
            long b = q.poll();
            q.add(a+b);
            q.add(a+b);
        }
        long sum = 0;
        for(int i = 0;i<n;i++){
            sum += q.poll();
        }
        System.out.print(sum);
    }
}
