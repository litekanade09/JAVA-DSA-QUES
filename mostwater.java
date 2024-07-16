import java.util.ArrayList;
public class mostwater {
    public static int mostWater(ArrayList<Integer> height){
        int maxwater = 0;
        //bruteforce:

        for(int i = 0;i<height.size();i++){
            for(int j = i + 1;j< height.size();j++){
                int widht = j  -1;
                int hei = Math.min(height.get(i),height.get(j));
                int curr = widht * hei;
                maxwater = Math.max(maxwater,curr);
            }
        }

        //2 pointer approach: Time Complexity = O(n);

        int lp = 0;
        int rp = height.size() - 1;
        while(lp < rp){
            int ht = Math.min(height.get(lp) , height.get(rp));
            int widht = rp - lp;
            int curr = widht * ht;
            maxwater = Math.max(maxwater,curr);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //186254837
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.print(mostWater(height));

    }
}
