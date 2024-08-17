import java.util.*;
public class BinaryNumbersOfDecimalNumbers {
    public static void BinaryNumbers(int n){
        Queue<String> Number = new LinkedList<>();
        Number.add("1");
        while(n-- > 0){
           String Number1 = Number.peek();
           Number.remove();
           System.out.println(Number1);
           String Number2 = Number1;
           Number.add(Number1 + "0");
           Number.add(Number2 + "1");
        }
    }
    public static void main(String[] args) {
        BinaryNumbers(5);
    }
}
