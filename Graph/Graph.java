import java.util.*;

public class Graph{

  public static void addedge(ArrayList<ArrayList<Integer>> arr,int s,int d){

    arr.get(s).add(d);
    arr.get(d).add(s);

  }

  public static void bfs(ArrayList<Integer> arr,int source){

  }


  public static void main(String[] args){

    int v=5;
    ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(5);

    for(int i=0;i<v;i++){
        arr.add(new ArrayList<Integer>());

    }


  }

}
