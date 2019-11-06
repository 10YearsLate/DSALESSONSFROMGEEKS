public class Graph{

  public static void addedge(ArrayList arr,int s,int d){
  
    arr.get(s).add(d);
    arr.get(d).add(s);
  
  }
  
  public static bfs(ArrayList<Integer> arr,int source){
  
  }


  public static void main(String[] args){
  
    int v=5;
    ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(5);
    
    for(int i=0;i<v;arr++){
        arr[i]=new ArrayList<Integer>();
        
    }
    
  
  }

}
