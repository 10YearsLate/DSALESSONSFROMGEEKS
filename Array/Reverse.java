


public class Reverse{

    public static void main(String[] args){
    
    int a= {1,2,3,4,5,6,7};
    
    int low=0,high=a.length-1;
    
    while(low < high){
    
        int temp=a[low];
        a[low]=a[high];
        a[high]=a[low];
        low++;
        high--;
    
    }
    
    for(int i=0;i<a.length;i++){
    
      System.out.println(a[i]);
    }
    
      
    
    
    }

}
