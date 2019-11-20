public class BIT{


    public static void main(String[] args){

        int[] a={1,1,2,2,3,4,4,5,5};

        BIT bit=new BIT();

        int[] b=new int[a.length+1];

        for(int i=0;i<a.length;i++){
            bit.update(1,a[i],b);
        }

        for(int i=1;i<b.length;i++){
            System.out.print(b[i]+" ");
            
            //System.out.print(bit.sum(1, b));
        }
        System.out.println("");
        for(int i=1;i<b.length;i++){
            //System.out.print(b[i]+" ");
            //System.out.println("");
            System.out.print(bit.sum(i, b)+" ");
        }

        

    }

    private int sum(int idx,int[] bit) {
            int s = 0;
            while(idx > 0) {
                s += bit[idx];
                idx -= idx & (-idx);
            }
        return s;
    }

    


    private void update(int val, int index, int[] b) {

        while(index<b.length){
            //System.out.print(index+" ");
            b[index]+=val;
            
            index+=(index & (-index));
        }
    }

    
}