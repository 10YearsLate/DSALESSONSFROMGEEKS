/*

Algorithm: Speciality is minimum number of swap

1.Max=-1
1.Iterate i=0;j=0l ;1..N-j;j++
2.if(a[i])>Max ;Max=a[i];Mazindex=i;
3.End of inner loop
4.Swap(a[n-1],a[maxindex])




i/p: 6 2 5 1
=> 6 2 5 1 =>1 2 5 6













*/

public class selection_sort{

    public static int[] selection(int[] a){

        int MAX=-1;
        int MI=-1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i;j++) {
                if(a[i]>MAX){
                MAX=a[i];
                MI=i;
            }
            swap(a,i,a.length-1);
            MI=-1;
            }

        }

        return a;
    }
    private static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
	}
	public static void main(String[] args){

            int[] a={5,2,3,1};
            selection(a);
            System.out.print(a);


    }
}