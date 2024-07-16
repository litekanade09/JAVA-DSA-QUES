import java.util.Scanner;

public class butterfly {
    public static void pattern(int n){
        int total_lines = n;
        int stars = 1;
        int spaces = 2*n-2;
        int current_lines = 1;

        while(current_lines <= total_lines){
            for(int i=1 ;i<=stars; i++){
                System.out.print("* ");
            }
            for(int i=1 ;i<=spaces;i++) {
                System.out.print(" ");

            }
            for(int i=1 ;i<=spaces;i++) {
                System.out.print(" ");

            }


            for(int i=1 ;i<=stars; i++){
                System.out.print("* ");
            }

            System.out.println();
            current_lines++;
            stars++;
            spaces = spaces -2;
        }


    }
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }
}
