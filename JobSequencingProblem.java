import java.util.*;
public class JobSequencingProblem {
    static class job{
        int deadLie;
        int profit;
        int id; //0(A), 1(B),2(C)

        public job(int i,int d,int p){
            id = i;
            deadLie = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int JobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i = 0;i<JobsInfo.length;i++){
            jobs.add(new job(i,JobsInfo[i][0],JobsInfo[i][1]));
        }

        //Descending order sorting of OBJECS
        Collections.sort(jobs,(obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int  i =0;i<jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadLie > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max JOBS = "+ seq.size());

        for(int  i =0 ;i< seq.size() ;i++){
            System.out.println(seq.get(i) + " ");
        }
        System.out.println();
    }
}
