import java.util.Scanner;
public class Nknight {
    static int N = 6;
    public static boolean issafe(int x,int y,int sol[][]){

        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }
    public static void printsolution(int sol[][]){
        for(int x = 0;x< N;x++){
            for(int y= 0;y < N;y++){
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }
    public static boolean solve(){
        int sol[][] = new int[8][8];
        for(int x= 0;x< N;x++)
            for(int y = 0;y < N;y++)
                sol[x][y] = -1;

        int xmove[] = {2,1,-1,-2,-2,-1,1,2};
        int yMove[] = {1,2,2,1,-1,-2,-2,-1};

        sol[0][0] = 0;
        if(!solveKT(0,0, 1,sol,xmove,yMove)){
            System.out.println("Soltion doe not exits");
            return false;
        }else{
            printsolution(sol);
        }
        return false;
    }
    public static boolean solveKT(int x,int y,int movei,int sol[][],int xmove[],int yMove[]){
        int nextx,nexty;
        if(movei == N*N)
            return true;
        for(int k = 0;k< 8;k++){
            nextx = x + xmove[k];
            nexty = y + yMove[k];
            if(issafe(nextx,nexty,sol)){
                sol[nextx][nexty] = movei;
                if(solveKT(nextx,nexty,movei + 1,sol,xmove,yMove)) {
                    return true;
                }else{
                    sol[nextx][nexty] = -1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        solve();
    }
}
