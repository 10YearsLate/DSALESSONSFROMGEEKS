public class DFSGraph{

  private ArrayList<ArrayList<Integer>> al;
  
  private void createGraph(int v){
  
    al=new ArrayList<ArrayList<Integer>>(v);
    
    for (int i=0;i<v;i++){
      al.add(new ArrayList<Integer>());
    }
  }
  
  private void addEdge(int a,int b){
  
    al.get(a).add(b);
    al.get(b).add(a);
  
  }
  
  private void DFSUtil(int source,boolean[] visited){
  
    if(visited[source]) return;
    else{
    
        System.out.print(source+" ");
        visited[source]=true;
        for(int j=0;j<al.get(source).size();j++){
            DFSUtil(al.get(source).get(j),visited);
        }
    
    }
  }
  
  private void DFS(int source){
  
    boolean[] visited=new boolean[al.size()];
    
    DFSUtil(source,visited);
  
  }

  public static void main(String[] args){
  
      DFSGraph d=new DFSGraph();
      d.createGraph(4);
      
      d.addEdge(1,2);
      d.addEdge(2,3);
      d.addEdge(3,4);
      d,addEdge(1,4);
      
      DFS(2);
  
  
  }


}
