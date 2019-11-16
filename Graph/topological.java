import java.util.ArrayList;
import java.util.HashSet;


import java.util.*;

public class topological{

    HashMap<Character,ArrayList<Character>> al;
    HashMap<Character,Boolean> visited;
    Stack<Character> st;
    HashSet<Character> vertices;
    


    public static void main(String[] args){

        int v=7;
        
        topological t=new topological();
        t.visited=new HashMap<Character,Boolean>(v);
        t.st=new Stack<Character>();
        t.vertices=new HashSet<Character>(v);
        t.creatGraph(v);

        t.addEdge('A','C');
        t.addEdge('B','C');
        t.addEdge('C','D');
        t.addEdge('D','F');
        t.addEdge('B','E');
        t.addEdge('F','G');
        t.addEdge('E','F');

        t.sort();

        while(t.st.size()>0){
          System.out.print(t.st.pop()+" ");
        }
        
    }

    private void sort() {
        Iterator<Character> it=vertices.iterator();
        while(it.hasNext()){
            char v=it.next();
            sortutil(v);
        }
    }

    private void sortutil(char v) {
        //System.out.print(v);
        if(visited.containsKey(v)==true) return;
        visited.put(v,true);
        
       // System.out.print(al.keySet());

        if(al.containsKey(v)==true ) {
            
                for(char a : al.get(v)){
                    //System.out.print(a+ "  ");
                sortutil(a);
                //st.add(a);

        } st.push(v);
        }
    //else {st.add(v);System.out.print("");}
    }

    private void addEdge(char c, char d) {
        ArrayList<Character> ac= al.get(c);
        if(ac==null){
            ArrayList<Character> o=new  ArrayList<Character>();
            o.add(d);
            al.put(c,o);
        }
        else ac.add(d);
        
        vertices.add(c);vertices.add(d);
        
    }

    private void creatGraph(int v) {
        al=new HashMap<Character,ArrayList<Character>>();
            

    }

    
}

class pair{
    char source;
    ArrayList<Character> destination=new ArrayList<Character>();

    pair(char c,char d){
        this.source=c;
        this.destination.add(d);
    }
}