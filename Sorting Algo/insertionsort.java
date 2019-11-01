/*abstract


Algo:

Start from i=1
check for left elements and insert it in correct position
do the same till N-1





*/

public class insertionsort{

    public static void util(int[]a,int n){

        //int key=a[1];


        for(int i=1;i<n;i++){
            int key=a[i];
            int k=i-1;
            while(k>=0 && a[k]>key){
                a[k+1]=a[k];
                k--;
            }
            a[k+1]=key;
        }

    }
    public static void main(String[] args){

        int[] a={10,80,30,90,40,50,70};

        util(a,a.length);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}