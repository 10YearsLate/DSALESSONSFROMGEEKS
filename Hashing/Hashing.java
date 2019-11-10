import java.util.*;

public class Hashing{


    public static void main(String[] args){
            int[] a={11,2,4,5,99999999,4,2,3,6,2,7};
            HashSet<Integer> hs=new HashSet<Integer>();
            for(int i=0;i<a.length;i++){
                hs.add(a[i]);
            }

            Iterator<Integer> it=hs.iterator();
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }

            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
            for(int i=0;i<a.length;i++){
                Integer c=hm.get(a[i]);
                if(c==null) hm.put(a[i], 1);
                else hm.put(a[i],++c);
            }
            Iterator<Map.Entry<Integer,Integer>> it2=hm.entrySet().iterator();
            while(it2.hasNext()){
                Map.Entry<Integer,Integer> e=(Map.Entry<Integer,Integer>)it2.next();
                System.out.println("The value "+e.getKey()+" has frequency of "+e.getValue());
            }

    }
}