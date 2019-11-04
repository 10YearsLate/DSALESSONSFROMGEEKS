import java.util.*;

class node{
    int d;
    node l;
    node r;
    node(int n){
        d=n;
    }
}

public class btree{

    node root;
    btree(){
        root=null;
    }

    public static void inorder(node n){
        if(n==null) return;
        inorder(n.l);
        System.out.print(n.d+" ");
        inorder(n.r);

    }

    public static void preorder(node n){

        if(n==null) return;
        System.out.print(n.d+" ");
        preorder(n.l);
        preorder(n.r);
    }

    public static void postorder(node n){

        if(n==null) return;
        postorder(n.l);
        postorder(n.r);
        System.out.print(n.d+" ");
    }

    public static void levelorder(node n){

        if(n==null) return;
        Queue<node> q=new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
            node current=q.poll();
            System.out.print(current.d+" ");
            if(current.l!=null) q.add(current.l);
            if(current.r!=null) q.add(current.r);
        }




    }

    public static void main(String[] args){
        //     3
        //   9       1
        //5     2    0     15
        btree bt=new btree();
        bt.root=new node(3);
        bt.root.l=new node(9);
        bt.root.r=new node(1);
        bt.root.l.l=new node(5);
        bt.root.r.l=new node(0);
        bt.root.l.r=new node(2);
        bt.root.r.r=new node(15);

        inorder(bt.root);
        System.out.println();
        preorder(bt.root);
        System.out.println();
        postorder(bt.root);
        System.out.println();
        levelorder(bt.root);






    }
}