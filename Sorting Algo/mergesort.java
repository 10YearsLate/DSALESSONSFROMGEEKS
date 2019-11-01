/*abstract

Algo:

Mergesort uses divide & conquer

Similar to quick sort it has a important function called merge
its pivot point is middle.it uses recursion

mergesort:

base case if (low < high)

int mid=low+(high-low)/2
mergesort(a,low,mid);
mergesort(a,mid+1,high);
merge(a,l,m,h)


merge algo:

create two sub array
populate element low..mid   & Mid+1 ...High

iterate both array together
if fist array element low ,then insert it to ouput array and increse
if both same take from left to ensure stability and incress left index
check if any elememtn left ,if yes add in sub array
check if any element left in right array and add accordingly


Timecomplexisity:

T(n)=2T(n/2) for two recursion and theta(n) for merge operation

It rounds to O(nlog(n))




*/
public class mergesort{


    public static void merge(int[] a,int low,int mid,int high){

        int[] larr=new int[mid-low+1];
        int[] rarr=new int[high-mid];
        int i=0,j=0,k=low;


        for(int g=0;g<larr.length;g++){
            larr[g]=a[low+g];
        }

        for(int g=0;g<rarr.length;g++){
            larr[g]=a[mid+1+g];
        }

        while(i<larr.length && j<rarr.length){
            if(larr[i] <= rarr[j] ){

                a[k]=larr[i];
                i++;

            }
            else{
                a[k]=rarr[j];
                j++;

            }
            k++;

        }

        while(i<larr.length){
            a[k]=larr[i];
            i++;k++;
        }
        while(j<rarr.length){
            a[k]=rarr[j];
            j++;k++;
        }

    }

    public static void mergesort_util(int[] a,int low,int high){


        if (low <high ) {   //base case

            int mid=low+((high-low)/2);
            mergesort_util(a, low, mid);
            mergesort_util(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }


    public static void main(String[] args){

        int[] a={10,80,30,90,40,50,70};

        mergesort_util(a, 0, 6);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }

}

// Bug is creating sub array