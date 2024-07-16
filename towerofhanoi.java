import java.util.Scanner;

public class towerofhanoi {
    public static void hanoi(int n ,String src,String helper,String destination){
        //basecase
        if(n == 1){
            System.out.println("transfer the " + n + " disk from " + src + " to " + destination);
            return;
        }
        //n -1 disks shift from src to hepler(B)
        hanoi(n - 1,src,destination,helper);
        //last disk shift from src to dest
        System.out.println("transfer the " + n+ " disk from " + src + " to " + destination);
        //n - 1 disk shift from helper to destination
       hanoi(n - 1,helper,src,destination);
    }
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,"A","B","C");
    }
}
