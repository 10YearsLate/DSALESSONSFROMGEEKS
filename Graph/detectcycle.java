import java.util.*;

public class detectcycle{

    private ArrayList<ArrayList<Integer>> al;

    private void createGraph(int v){

        al=new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            al.add(new ArrayList<Integer>());
        }
    }

    private void addEdge(int a,int b){

        al.get(a).add(b);
    }

    private boolean findcycle(){

        boolean[] visted=new boolean[al.size()];
        boolean[] rec=new boolean[al.size()];

        for(int i=1;i<al.size();i++){
            
            boolean flag=iscycle(i,visted,rec);
            //System.out.print(flag+" ");
            if (flag==true) return flag;
        }
        return false;
    }

    private boolean iscycle(int i,boolean[] v,boolean[] r){
        //boolean flag=false;

        if(r[i]==true) return true;

        if(v[i]==true) return false;

        r[i]=true;
        v[i]=true;
        //System.out.print(i+" ");
        for(int j=0;j<al.get(i).size();j++){
            if(iscycle(al.get(i).get(j),v,r)) return true;
        }

        r[i]=false;

        return false;
    }

   public static void main(String[] args){

        detectcycle d=new detectcycle();

        d.createGraph(5);

        d.addEdge(1,2);
        d.addEdge(2,3);
        d.addEdge(3,4);
        //d.addEdge(4,1);

        System.out.print(d.findcycle());

   } 
}