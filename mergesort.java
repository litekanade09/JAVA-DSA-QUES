import java.util.Scanner;
public class mergesort {
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    public static void merge(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si+(ei - si)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        mergeSort(arr,si,mid,ei);
    }
    public static void mergeSort(int arr[],int si,int mid,int ei){

        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;

            }else{
                temp [k] = arr[j];
                j++;
            }
            k++;
        }
        //leftpart
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //rightpart
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //copy to original arr
        for(k=0,i = si; k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,2,5,8};
        merge(arr,0,arr.length - 1);
        printarr(arr);
    }
}
