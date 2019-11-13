import java.util.*;

public class bfs{

  private ArrayList<ArrayList<Integer>> al;

  private void createGraph(int v){
  
    al=new ArrayList<ArrayList<Integer>>(5);
    for(int i=0;i<5;i++){
        al.add(new ArrayList<Integer>());
    }
  }
  
  private void addEdge(int a,int b){
    
    al.get(a).add(b);
    al.get(b).add(a);
  }
  
  private void bfsutil(int source){
  
    boolean[] visited=new boolean[al.size()];
    
    Queue<Integer> st=new LinkedList<Integer>();
    
    st.add(source);
    
    while(!st.isEmpty()){
      
      int c=st.remove();
      
      if(!visited[c]) System.out.print(c+" ");
      visited[c]=true;
      for(int i=0;i<al.get(c).size();i++){
        
        if(!visited[al.get(c).get(i)]) st.add(al.get(c).get(i));
      }
    }
    
  }

  public static void main(String[] args){
    
      bfs b=new bfs();
      b.createGraph(5);
      
      b.addEdge(1,2);
      b.addEdge(1,3);
      b.addEdge(3,4);
      b.addEdge(2,4);
      
      b.bfsutil(1);
      
      
      
  }
}
