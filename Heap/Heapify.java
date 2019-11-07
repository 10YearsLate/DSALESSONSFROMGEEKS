/*
1.Build a Heap from a unsorted Array -- BuildHeap
2.Get Minimum element                --GetRoot
3.Delete Minimum                     --ExtractRoot
4.Insert Item                        --Insert
5.Delete Item                        --Delete
6.update Item                         --DecreaseKey

public class Heapify{

  public static int[] heapify(int[] op,int start){
  
  int left=(2*start)+1;
  int right=(2*start)+2;
  
  if(op[start]>op[left]){
    
  }
  
  }

  public static int[] buildHeap(int[] a){
  
    int[] op=new int[100]; //100 capacity
    for(int i=0;i<a.length;i++){
      op[i]=a[i];
    }
    int n=a.length;
    int start=(n-2)/2
    
    op=heapify(op,start);
    return op;
  
  }

  public static void main(String[] args){
  
    int[] a={2,3,6,1,2,67,20};
    
  
  }

}
