/*

Algo:

Get the Sorted Array
BSearch(arr,low,high,item)
find mid
if(arr[mid]==item return
else if(arr[mid]<item arr,low,mid-1,item) else bsearc(a,mid+1,high,item)

*/

public class bsearch{

  public static int bsearch(int[] a,int l,int h,int item){
  
    int mid=l+(h-l)/2;
    if(mid==low && a[mid]!=item) return -1;
    if(mid==high && a[mid]!=item] return -1;
    if(a[mid]==item) return mid;
    else{
      if(a[mid]>item) bsearch(a,l,mid-1;item);
      else bsearch(a,mid+1,h,item);
    
    }
  
  }


  public static void main(String[] args){
  
    int[] a={1,2,3,4,5,6,7};
    int item=5;
    int index=bsearch(a,0,6,5);
    System.out.println(index);
  
  }


}
