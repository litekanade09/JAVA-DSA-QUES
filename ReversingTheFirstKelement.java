import java.util.*;
public class ReversingTheFirstKelement {
    public static Queue<Integer> ReverseQueue(Queue<Integer> q,int k){
        solve(q,k);
        int s = q.size() - k;
        while(s-- > 0){
            int x = q.remove();
            q.add(x);
        }
        return q;
    }
    public static void solve(Queue<Integer> q,int k) {
        if(k == 0){
            return;
        }
        int e = q.remove();
        solve(q,k - 1);
        q.add(e);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        int k = 5;
        queue = ReverseQueue(queue,k);
        while(!queue.isEmpty()){
            System.out.print(queue.remove() + " ");
        }
    }
}
