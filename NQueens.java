import java.util.Scanner;
public class NQueens {
    public static boolean  Rani(char board[][],int row,int col){
        //vertical
        for(int i = row-1;i>= 0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i = row-1,j = col-1;i>= 0 && j>= 0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal rigth up
        for(int i = row-1,j = col +1;i>= 0 && j < board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void queens(char board[][],int row){
        //base
        if(row == board.length){
            printboard(board);
            return;

        }
        //column loop
        for(int j = 0;j<board.length;j++){
            if(Rani(board,row,j)){
                board[row][j] = 'Q';
                queens(board,row+1);//function call
                board[row][j] = 'X';//backtarcking
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("------- CHESS BOARD---------");
        for(int i = 0;i< board.length;i++){
            for(int j = 0 ;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 4;
        char board[][] = new char[N][N];
        //initialize
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                board[i][j] = 'X';
            }
        }
        queens(board,0);
    }
}
