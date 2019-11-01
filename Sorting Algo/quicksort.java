/*

Algo:

This search uses a Pivot function and organize the data in left and right and sort it in recursive manner

quicksort(int a[],low,high){

    int pivot=pivot()
    quicksort(a,low,pivot-1)
    quicksort(a,pivot+1,high)
}

pivot Algo:

1.Take the right most element as Pivot pivot=arr[high];
2.set smaller index =-1 initially
3.iterate from low-->High -1
4.if arr[low]<=pivot  increse i and swap arr[i] & arr[j]
5.end inner loop
6.swap arr[i+1] with pivot
7.return pivot index that is i+1

Time complexity:

T(n) : FIrst half recursion T(k) + second half T(n-k-1) +theta(n) for partinioing

for worst case when everytime smallest or largest is picked as Pivot it is T(n)=t(0+t(n-1)+theta n) -O(n2)
Best case , Pivot in middle or median in that case T(n) =2T(n/2)+theta(n)  this is nLog(n)







*/

public class quicksort{

    public static void swap(int[] a,int b,int c){

        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }

    public static int pivot(int[] a,int low,int high){
        int i=low-1;
        //System.out.println(high);
        int pivot_val=a[high];
        for(int j=low;j<=high-1;j++){
            if(a[j]<=pivot_val){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }

    public static void quicksort_util(int[] a,int low,int high){
            if(low<high){
                int pivot=pivot(a,low,high);
                quicksort_util(a,0,pivot-1);
                quicksort_util(a,pivot+1,high);
             }
    }
    public static void main(String[] args){
        int[] a={10,80,30,90,40,50,70};

        quicksort_util(a,0,6);


        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}

//Bug base case in recursion not written