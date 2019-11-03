/*

Algo:

Get the Sorted Array
BSearch(arr,low,high,item)
find mid
if(arr[mid]==item return
else if(arr[mid]<item arr,low,mid-1,item) else bsearc(a,mid+1,high,item)

*/

public class BinarySearch{

  public static int bsearch(int[] a,int l,int h,int item){

    int mid=l+(h-l)/2;
    int pos=-1;
    //System.out.println(a[mid]+" "+item);
    if(mid==l && a[mid]!=item) return pos;
    if(mid==h && a[mid]!=item) return pos;
    if(a[mid]==item) pos=mid;
    else{
      if(a[mid]>item) pos=bsearch(a,l,mid-1,item);
      else pos=bsearch(a,mid+1,h,item);

    }
    return pos;

  }

  public static int bsearchiter(int[] a,int l,int h,int item){

      int pos=-1;

      for(int i=l;i<=h;i++){
          int mid=l+(h-l)/2;
          //System.out.println(a[mid]+" "+mid);
          if(a[mid]==item) pos=mid;
          if(a[mid]>item) h=mid-1;
          if(a[mid]<item) l=mid+1;
      }
      return pos;
  }


  public static void main(String[] args){

    int[] a={1,2,3,4,5,6,7};
    int item=5;
    int index=bsearch(a,0,6,item);
    System.out.println(index);
    System.out.println(bsearchiter(a,0,6,item));

  }


}
