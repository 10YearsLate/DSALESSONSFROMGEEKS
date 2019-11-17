import java.util.*;

public class fractionalknapsack{

    public static void main(String[] args){
    int capacity=50;
    float finalval=0;


    item[] coll=new item[3];
    coll[0]=new item(10,60);
    coll[1]=new item(20,100);
    coll[2]=new item(30,120);

    
    Arrays.sort(coll,new item());

    for(item i: coll){
        
            System.out.println(i.quantity+" "+i.value+" "+i.ratio);

        if(i.quantity<capacity){
            capacity=capacity-i.quantity;
            finalval+=i.value;
            System.out.println(i.quantity+" "+i.value+" "+i.ratio);
        }
        else{
            capacity=0;
            finalval+=capacity*i.ratio;
            System.out.println(i.quantity+" "+i.value+" "+i.ratio);
        }
    }
    System.out.print("Total Val in Knapsack "+finalval);
}

}

class item implements Comparator<item>{
    int quantity;
    int value;
    float ratio;

    item(){}

    item(int q,int v){
        this.quantity=q;
        this.value= v;
        this.ratio=v/q;
    }
    @Override
    public int compare(item o1, item o2) {
        if(o1.ratio==o2.ratio) return 0;
        if(o1.ratio>o2.ratio) return 1;
        if(o1.ratio<o2.ratio) return -1;

        return 0;

    }
}