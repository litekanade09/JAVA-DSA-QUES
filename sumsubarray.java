import java.util.Scanner;

public class sumsubarray {
    public static int subarray(int num[]){
        int totalSum = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0;i< num.length;i++){
            for (int j = i;j<num.length;j++){
                totalSum = 0;
                for(int k = i;k<=j;k++){
                    //subarray sum
                    totalSum = totalSum + num[k];
                }
                System.out.println(totalSum);
                if(maximum < totalSum){
                    maximum = totalSum;
                }
            }
        }
        System.out.print("maximum Susbarray sum is" + maximum);
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Chal chutiye apne khudke char number daal: ");
        int num[] = new int [4];
        num[0]= input.nextInt();
        num[1]= input.nextInt();
        num[2]= input.nextInt();
        num[3]= input.nextInt();
        subarray(num);

    }
}
