import java.io.*;
import java.util.ArrayList;

public class Baekjoon1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long sum = 0;
        long cnt = 0;
        for (int i = 1; ; i++) {
            if (sum > n) {
                break;
            }
            sum += i;
            cnt++;
        }
        System.out.print(cnt - 1);

    }
}