import java.util.Scanner;

public class sellbuystocks {
    public static int sellbuy(int price[]){
        int buyingprice = Integer.MAX_VALUE ;
        int maxprofit = 0;

        for(int i =0;i< price.length;i++){
            int sellingprice = price[i];
            if(buyingprice < sellingprice){
                int profit = sellingprice - buyingprice;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                buyingprice = sellingprice;
            }
        }
        System.out.print(maxprofit);
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,6,4,3,1};
        sellbuy(price);
    }
}
