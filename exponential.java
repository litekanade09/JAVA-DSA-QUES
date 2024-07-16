import java.util.Scanner;
public class exponential {
    public static int number(int n,int x){
        if(n == 0){
            return 1;
        }
        return x * number(n-1,x);
    }
    public static void main(String[] args) {
        System.out.print(number(2,4));
    }
}
