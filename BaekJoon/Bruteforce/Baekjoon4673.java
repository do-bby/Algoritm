package Bruteforce;

import java.util.ArrayList;

public class Baekjoon4673 {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for(int i = 1; i<101;i++){
            int n = d(i);
            if(n<101){
                arr[n]++;
            }
        }
        for(int i = 1; i<arr.length;i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }
    }
    public static int d(int number){
        int sum = number;
        while(number!=0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }
}
