import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {

        // WHEN END TIME ID ALREADY SORTED



//        int start[] = {1,3,0,5,8,5};
//        int end[] = {2,4,6,7,9,9};
//
//
//
//        int count = 0;
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        count = 1;
//        ans.add(0);
//        int lastend = end[0];
//        for(int  i = 0;i<end.length;i++){
//            if(start[i] >= lastend) {
//                count++;
//                ans.add(i);
//                lastend = end[i];
//            }
//        }
//        System.out.println("Max Activites =" + count);
//        for(int i = 0;i<ans.size();i++){
//            System.out.print("A" + ans.get(i)+" ");
//        }
//        System.out.println();


        // WHEN END TIME IS NOT ALREADY SORTED



        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};


        int activites[][] = new int[start.length][3];
        for(int i = 0;i<start.length;i++){
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        //lambda Function = short form
        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2]));


        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        count = 1;
        ans.add(activites[0][0]);
        int lastend = activites[0][2];
        for(int  i = 1;i<end.length;i++){
            if(activites[i][1] >= lastend) {
                count++;
                ans.add(activites[i][0]);
                lastend = activites[i][2];
            }
        }
        System.out.println("Max Activites =" + count);
        for(int i = 0;i<ans.size();i++){
            System.out.print("A" + ans.get(i)+" ");
        }
        System.out.println();
    }
}
