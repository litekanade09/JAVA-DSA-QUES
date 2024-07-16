import java.util.Scanner;

public class diamond {
    public static void rhombus(int n){
        int total_lines = n;
        int stars  = 1;
        int spaces = n-1;
        int current_lines = 1;

        while(current_lines<= total_lines){
            for(int i=1 ;i<= spaces;i++){
                System.out.print("  ");
            }
            for(int i=1;i<= stars;i++){
                System.out.print("* ");
            }
            System.out.println();
            stars = stars+2;
            spaces--;
            current_lines++;
        }


    }
    public static void main(String[] args) {
        int n = 4;
        rhombus(n);

    }
}