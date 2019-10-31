/*

Algorithm: Speciality is minimum number of swap

1.iterate from o...n-1 with i
1.set minindex=i
2.inner loop from j=i+1;j<n
3.compare and set minindex
4.Swap(a[o],a[minindex])




i/p: 6 2 5 1
=> 6 2 5 1 =>1 2 5 6













*/

public class selection_sort{


    public static int[] stable_selection(int[] a){

        for(int i=0;i<a.length;i++){
            int MI=i;
            for(int j=i+1;j<a.length;j++){

                if(a[MI]>a[j]) MI=j;

            }
            int key=a[MI];
            while(MI>i){
                a[MI]=a[MI-1];

            }
            a[i]=key;
        }

        return a;
    }

    public static int[] selection(int[] a){


        int MI;
        for(int i=0;i<a.length;i++){
            MI=i;
            for(int j=i+1;j<a.length;j++) {  // time complexity o(n2) , this is not stable

                if(a[j]<a[i]){
                    MI=j;
                }
                swap(a,i,MI);

            }

        }

        return a;
    }
    private static void swap(int[] a, int i, int j) {
        //System.out.print(i+" "+j);
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
	}
	public static void main(String[] args){

            int[] a={5,2,3,1};
            selection(a);
            stable_selection(a); //this method is stable, preious one is not
            for(int i=0;i<a.length;i++){
		        System.out.print(a[i]+ " ");
	        }



    }
}

//Bug in swap function