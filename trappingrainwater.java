import java.util.Scanner;

public class trappingrainwater {
    public static int trapping(int height[]){
       //calculate the left bar boundary
        int leftbar[] = new int[height.length];
        leftbar[0] = height[0];
        for(int i  = 1;i<height.length;i++){
            leftbar[i] = Math.max(height[i], leftbar[i-1]);
        }
        //calculate right bar boundary
        int rightbar[] = new int[height.length];
        rightbar[height.length-1] = height[height.length -1];
        for(int i = height.length - 2;i>=0;i--){
            rightbar[i] = Math.max(height[i],rightbar[i+1]);
        }
        //loop
        int rainWater = 0;
        int widht = 1;
        for(int i = 0;i<height.length;i++){
            int waterlevel = Math.min(leftbar[i],rightbar[i]);
            rainWater += (waterlevel - height[i]) * widht;
            
        }
        return rainWater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.print( trapping(height));
    }
}
