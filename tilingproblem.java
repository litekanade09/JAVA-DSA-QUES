import java.text.AttributedCharacterIterator;
import java.util.Scanner;
public class tilingproblem {
    public static int tiles(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        //vertical tiles
        int fnm1  = tiles(n - 1);
        //horizontal
        int fn = tiles(n -2);
        int totalways = fnm1 + fn;
        return totalways;
    }
    public static void main(String[] args) {
       Scanner input  = new Scanner(System.in);
       int n = input.nextInt();
       System.out.print(tiles(n));
    }
}
