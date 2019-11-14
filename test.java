import java.util.Comparator;
import java.util.PriorityQueue;

     class ab {

        int val;
        int rank;

        ab(int val,int rank){
            this.val=val;
            this.rank=rank;
        }
    }

    class abcompare implements Comparator<ab>{

    @Override
    public int compare(ab o1, ab o2) {
        if(o1.rank==o2.rank) return 0;
        if(o1.rank<o2.rank) return 1;
        if(o1.rank>o2.rank) return -1;
        return 0;
    }

    }

public class test {

     

    public static void main(String[] args){

        ab a=new ab(2,3);
        ab b=new ab(3,2);

        PriorityQueue<ab> pq=new PriorityQueue<ab>(9,new abcompare());
        pq.add(a);
        pq.add(b);
        System.out.print(pq.remove().rank+" "+pq.remove().rank);
            

            
    }
}