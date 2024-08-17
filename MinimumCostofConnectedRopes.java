import java.util.*;
public class MinimumCostofConnectedRopes {
    public static int MinimumCost(int arr[],int n){
        PriorityQueue<Integer> cost = new PriorityQueue<Integer>();
        for(int i = 0;i < n;i++){
            cost.add(arr[i]);
        }
        int count = 0;
        while(cost.size() > 1){
            int first = cost.remove();
            int second = cost.remove();
            count += first + second;
            cost.add(first + second);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4 ,2,3 ,6};
        int n = arr.length;
        System.out.print(MinimumCost(arr,n));

    }
}
