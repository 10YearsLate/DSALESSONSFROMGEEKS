import java.util.*;

public class connected{

    private ArrayList<ArrayList<Integer>> al;
    private boolean[] visited;

    public static void main(String[] args){


        connected c=new connected();
        int v=5;
        c.createGraph(v);

        c.addedge(0,1);
        c.addedge(1, 2);
        c.addedge(3, 4);
        c.visited=new boolean[c.al.size()];
        for(int i=0;i<v;i++){
        c.DFS(i);
        System.out.println();
        }
        

    }

    private void DFS(int i) {
        if(visited[i]) return;

        System.out.print(i+ " ");
        visited[i]=true;

        for(int j=0;j<al.get(i).size();j++){
            DFS(al.get(i).get(j));
        }
    }

    

    private void addedge(int i, int j) {
        al.get(i).add(j);
        al.get(j).add(i);
    }

    private void createGraph(int v) {
        al=new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            al.add(new ArrayList<Integer>());
        }

    }
}