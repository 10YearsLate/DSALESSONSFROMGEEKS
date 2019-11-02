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

        //int start=0;

        //int pos=0;
        for(int start=0;start<=n-2;start++){
            int item=a[start];

            int pos=start;      //another bug found
            for(int i=start+1;i<n;i++)
                if(a[i]<item)
                pos++;

            if(pos==start) continue;

            while(item==a[pos]) pos++;

            if(pos!=start){
                int temp=a[pos];
                a[pos]=item;
                item=temp;
            }

            while(pos!=start){
                pos=start;

                for(int i=start+1;i<n;i++){

                    if(a[i]<item){
                        pos++;
                    }
                    //if(pos==start) continue;

                    while(item==a[pos]) pos++;

                    if(a[pos]!=item){
                        int temp=a[pos];
                        a[pos]=item;
                        item=temp;

                    }
                }

            }

        }
    }


    public static void main(String[] args){
        int[] a={2,8,1,6,2,6};
        cycle(a,a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

//bug infinite loop