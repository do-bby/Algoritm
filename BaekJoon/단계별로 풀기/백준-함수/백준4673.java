public class Main{
    public static void main(String[] args){
        
        boolean[] c = new boolean[10001];
        for(int i = 1; i<10001; i++){
            int n = num(i);
            if(n<10001){
                c[n] = true;
            }
        }
        for(int i =1; i<10001;i++){
            if(!c[i]){
                System.out.println(i);
            }
        }
    }
    public static int num(int number){
        int sum = number;
        while(number !=0){
            sum +=number%10;
            number = number/10;
        }
        
        return sum;
    }
}