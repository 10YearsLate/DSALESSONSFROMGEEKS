/*
Algo:

Find a range ,create an array with length high range

traverse and add frequency

cumulative add

check the number and reduce and draw output

*/

public class countsort{

    public static int[] count(int[] a,int n)
    {
        int[] op=new int[n];
        int[] temp=new int[8];

        for(int i=0;i<n;i++){
            temp[a[i]]++;
        }


        for(int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }


        for(int i=0;i<n;i++){
            op[temp[a[i]]-1]=a[i];
            temp[a[i]]--;
        }

        return op;


    }



    public static void main(String[] args){
        int a[]={1, 4, 1, 2, 7, 5, 2};
        int[] op=count(a,a.length);
        for(int i=0;i<op.length;i++){
            System.out.print(op[i]);
        }

    }
}

