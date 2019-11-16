import java.util.*;

import javax.print.attribute.standard.Destination;
import javax.xml.transform.Source;

public class Bellman{

    ArrayList<ArrayList<Edge>> al;
    int[] Parent;
    int[] shortest_path;


    public static void main(String[] args){

        Bellman b=new Bellman();
        int v=5;
        b.createGraph(v);

        /*for negative weight cycle
        
        b.al.get(0).add(new Edge(1,1));
        b.al.get(1).add(new Edge(2,3));
        b.al.get(3).add(new Edge(1,-6));
        b.al.get(2).add(new Edge(3,2));
        */

        b.al.get(0).add(new Edge(1,9));
        b.al.get(0).add(new Edge(2,6));
        b.al.get(0).add(new Edge(3,5));
        b.al.get(0).add(new Edge(4,3));

        b.al.get(2).add(new Edge(1,2));
        b.al.get(0).add(new Edge(3,5));
        b.shortest_path=b.bellutil(0);

        for(int i=0;i<b.shortest_path.length;i++){
            System.out.println(b.shortest_path[i]);
        }
    }

    private int[] bellutil(int source) {

        shortest_path=new int[al.size()];
        Parent= new int[al.size()];

        for(int a=0;a<al.size();a++){
            shortest_path[a]=Integer.MAX_VALUE;
        }
        shortest_path[source]=0;
        Parent[source]=Integer.MIN_VALUE;
        int counter=1;
        while(counter<=al.size()-1){

        
        for(int k=0;k<al.size();k++){
            for(int l=0;l<al.get(k).size();l++){
                relax(k,al.get(k).get(l),Parent,shortest_path);
            }
            
        }
        counter++;
        }
        for(int k=0;k<al.size()-1;k++){
            for(int l=0;l<al.get(k).size();l++){
                if(!relax(k,al.get(k).get(l),Parent,shortest_path)){
                    System.out.print("Negative weight cycle detected");
                }
            }
            
        }
        return shortest_path;
    }

    

    private boolean relax(int k, Edge edge, int[] parent2, int[] shortest_path2) {
        
        boolean flag=true;
        
        int source=k;
        int destination=edge.destination;
        int cost=edge.cost;
        
        int sp_source=shortest_path2[k];
        int sp_desti=shortest_path2[destination];
        if(sp_source+cost<sp_desti){
            shortest_path2[destination]=sp_source+cost;
            parent2[destination]=source;
            flag=false;
        }

        System.out.println("Source: "+k+" Destination: "+destination+" cost: "+shortest_path2[destination]);
        Parent=parent2;
        shortest_path=shortest_path2;
        return flag;

    }

    private void createGraph(int i) {

        al=new ArrayList<ArrayList<Edge>>(i);

        for(int j=0;j<i;j++){
            al.add(new ArrayList<Edge>());
        }
    }

}

class Edge{

    int destination;
    int cost;

    Edge(){}

    Edge(int a,int b){
        this.destination=a;
        this.cost=b;
    }


}