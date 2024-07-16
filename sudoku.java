import java.util.Scanner;
public class sudoku {
    public static boolean isSafe(int sudukogame[][],int row,int col,int digit){
        //column
        for(int i = 0;i<= 8;i++){
            if(sudukogame[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j = 0;j<= 8;j++){
            if(sudukogame[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr;i< sr + 3;i++){
            for(int j = sc;j < sc+3 ; j++){
                if(sudukogame[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solver(int sudukogame[][],int row,int col){
        //basecase
        if(row == 9 && col == 0){
            return true;
        }

        //recursion
        int nextrow  = row,nextcol = col + 1;
        if(col +1 == 9){
            nextrow = row+ 1;
            nextcol = 0;
        }
        if(sudukogame[row][col] != 0){
            return solver(sudukogame,nextrow,nextcol);
        }
        for(int digit = 1;digit <= 9;digit++){
            if(isSafe(sudukogame,row,col,digit)){
                sudukogame[row][col] = digit;
                if(solver(sudukogame,nextrow,nextcol)){
                    return true;
                }
                sudukogame[row][col] =0;
            }
        }
        return false;
    }
    public static void printSuduko(int sudukogame[][]){
        for(int i = 0;i< 9;i++){
            for(int j = 0;j<9;j++){
                System.out.print(sudukogame[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudukogame[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if(solver(sudukogame,0,0)){
            System.out.println("Solution exits ");
            printSuduko(sudukogame);
        }else {
            System.out.print("Solution does not exits");
        }
    }
}
