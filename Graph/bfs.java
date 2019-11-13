import java.util.*

public class bfs{

  private ArrayList<ArrayList<Integer>> al;

  private void createGraph(int v){
  
    al=new ArrayList<ArrayList<Integer>>(5);
    for(int i=0;i<5;i++){
        al.add(new ArrayList<Integer>);
    }
  }
  
  private void addEdge(int a,int b){
    
    al.get(a).add(b);
    al.get(b).add(a);
  }
  
  private void bfs(int source){
  
    boolean[] visited=new boolean[al.size()];
    
    Queue<Integer> st=new Queue<Integer>(al.size());
    
    st.add(source);
    
    while(!st.isempty()){
    
      int c=st.remove();
      visited[c]=true;
      for(int i=0;i<al.get(c).size();i++){
        st.add(al.get(c).get(i);
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
      
      bfs(1);
      
      
      
  }
}
