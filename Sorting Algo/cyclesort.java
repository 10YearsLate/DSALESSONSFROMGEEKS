 /*abstract

Algo:

start from first element and loop to Last

item=a[i]

run loop from i+1 ..n

find the pos for item to insertm and before that hold the value in item

while(pos!=i){ do the same above}

*/

public class cyclesort{

    public static void cycle(int[] a,int n){


        for(int start=0;start<=n-2;start++){
            int item=a[start];
            int pos=start;      //another bug found
            for(int i=start+1;i<n;i++){
                if(a[i]<item)
                pos++;
            }

            if(pos==start) continue;

            while(item==a[pos]) pos+=1;

            if(pos!=start){
                int temp=item;
                item=a[pos];
                a[pos]=temp;
            }

            while(pos!=start){
                //System.out.print("while apos" +a[pos]+""+item+" "+pos);
                pos=start;

                for(int i=start+1;i<n;i++){

                    if(a[i]<item)
                        pos+=1;
                    }
                    //if(pos==start) continue;

                    while(item==a[pos]) pos+=1;

                    if(item != a[pos]){
                        int temp=item;
                        item=a[pos];
                        a[pos]=temp;

                    }


                }

            }

        }



    public static void main(String[] args){
        int[] a={ 1, 8, 3, 9, 10, 10, 2, 4 };
        cycle(a,a.length);
        for(int i1=0;i1<a.length;i1++){
            System.out.print(a[i1] + " ");
        }
    }
}

//bug infinite loop