import java.util.*;

public class Dikstra{

    private ArrayList<ArrayList<Edge>> al;
    private int[] dis;
    HashSet<Integer> hs;
    PriorityQueue<Edge> pq;

    private void createGraph(int v){

            al=new ArrayList<ArrayList<Edge>>(v);

            for(int i=0;i<v;i++){
                al.add(new ArrayList<Edge>());

            }

    }

    public static void main(String[] args){

        Dikstra d=new Dikstra();
        int v=5;
        d.createGraph(v);

        d.al.get(0).add(new Edge(1,9));
        d.al.get(0).add(new Edge(2,6));
        d.al.get(0).add(new Edge(3,5));
        d.al.get(0).add(new Edge(4,3));

        d.al.get(2).add(new Edge(1,2));
        d.al.get(0).add(new Edge(3,5));

        int src=0;
        
        d.dis=d.findsp(src);
        for(int k=0;k<d.dis.length;k++){
            System.out.println(d.dis[k]);
        }
        


        
    }

    private int[] findsp(int src) {

        dis=new int[al.size()];
        hs=new HashSet<Integer>(al.size());
        pq=new PriorityQueue<Edge>(al.size(),new Edge());

        for(int i=0;i<al.size();i++){
            dis[i]=Integer.MAX_VALUE;

        }
        dis[src]=0;
        pq.add(new Edge(src,dis[src]));

        while(hs.size()!=al.size()){

            Edge current_edge=pq.remove();
            hs.add(current_edge.desti);
            for(int j=0;j<al.get(current_edge.desti).size();j++){
                Edge parent=current_edge;
                int parent_cost=dis[current_edge.desti];
                Edge child=al.get(parent.desti).get(j);
                int child_cost=dis[child.desti];
                if(child_cost > (parent_cost+ child.cost)) dis[child.desti]=(parent_cost+ child.cost);
                pq.add(new Edge(child.desti,dis[child.desti]));
            }

            

        }

        return dis;
    }
}

class Edge implements Comparator<Edge> {
    int desti;
    int cost;

    Edge(){};

    Edge(int a,int b){
        this.desti=a;
        this.cost=b;
    }

    @Override
    public int compare(Edge o1,Edge o2){

        if(o1.cost==o2.cost) return 0;
        if(o1.cost>o2.cost) return 1;
        if(o1.cost<o2.cost) return -1;
        return 0;

    }


}