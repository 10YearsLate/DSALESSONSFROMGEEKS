public class Rotate{

    public static void reverse(int[] a,int l,int h){

        while(l<h){
            int item=a[l];
            a[l]=a[h];
            a[h]=item;
            l++;
            h--;
        }

    }

    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        int rotation=3;
        reverse(a,0,rotation-1);
        reverse(a,rotation,a.length-1);
        reverse(a,0,a.length-1);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }
}