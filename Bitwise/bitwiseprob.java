import java.util.*;

public class bitwiseprob{


    public static void main(String[] args){

        System.out.println(checkkthbit(13,2));

        System.out.println(checkpow2(16));

        System.out.println(numberofsetbit(7));

        int[] a={7,7,1,3,4,4,1};

        System.out.println(findoddnumber(a));

        int[] b={7,7,7,2,4,5,2,4};
        System.out.println(findoddpair(b)[0]+" "+findoddpair(b)[1]);   //Bug found

        ArrayList<String> al=Generatepowerset("ABC");
        
    }

    private static ArrayList<String> Generatepowerset(String string) {
        
        ArrayList<String> al=new ArrayList<String>();
        int n=string.length();
        int num=(1<<n);
        for(int i=0;i<=num;i++){
            for(int j=0;j<n;j++){
                //if()
            }
        }
        return null;
    }

    private static int[] findoddpair(int[] b) {
        int[] op=new int[2];
        
        int xor=0;

        for(int i=0;i<b.length;i++){
            xor=xor^b[i];
            //if(xor^b[b.length-1-i])
        }

        for(int j=0;j<b.length;j++){
            if((xor^b[j])!=0){
                op[0]=(Integer)xor^b[j];
                op[1]=(Integer)xor^op[0];
            }
        }
        return op;
    }

    private static int findoddnumber(int[] a) {
        int cnt=0;
        for(int i=0;i<a.length;i++){
            cnt=cnt^a[i];
        }

        return cnt;
    }

    private static int numberofsetbit(int i) { // Brian Karnighan Algorithm
        int cnt=0;
        if(i==0) return 0;
        while(i>0){
            i=(i&(i-1));
            cnt++;
        }
        return cnt;
    }

    private static boolean checkpow2(int i) {
        return (i&(i-1))==0;
    }

    private static boolean checkkthbit(int i, int j) {
        
        return (i^(1<<j))!=0;
        //return true;
    }
}