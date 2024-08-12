import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int W = 50;
        double ratio[][] = new double[value.length][2];

        //0th col => idx; 1st col => ratio

        for(int i = 0; i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capcity = W;
        int FinalVal = 0;
        for(int i = ratio.length -1 ;i>= 0;i--){
            int idx = (int)ratio[i][0];
            if(capcity >= weight[idx]){
                FinalVal += value[idx];
                capcity -= weight[idx];
            }else{
                FinalVal += (ratio[i][1] * capcity);
                capcity = 0;
                break;
            }
        }
        System.out.print(FinalVal);
    }
}
