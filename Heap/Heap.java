public class Heap{

  

  int size,capacity;
  int[] arr;
  
  void Heap(){
    arr=new int[capacity];
    size=0;
  }
  
  public static int getmin(int[] arr){
    return arr[0];
  }
  
  public static void insert(int[] arr,int item,int size){
  
    arr[size]=item;
    size++;
    int i=size-1;
    
    while(i > 0 && arr[i] < arr[(i-1)/2)]){
          int temp=arr[size];
          arr[size]=arr[(size-1)/2)];
          arr[(size-1)/2)]=temp;
          i=(i-1)/2
    }
  
  }
  
  public static void main(String[] args){
  
    arr={2,3,4};
    System.out.println(getmin(arr));
  
  }

}
