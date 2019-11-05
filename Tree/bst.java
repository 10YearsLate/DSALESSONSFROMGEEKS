/*


Binary search tree property

1.left <root <right
2.no duplcates
2.both subtree should be bst

Library Implementation:
TreeMap,TreeSet

operation : Insert(log(h) ,search(logh),delete logh
inorder traversal is sorted

*/

class node{

  int d;
  node left;
  node right;
  node(int data){

    d=data;

    }


}

public class bst{

    public static node insert(node root,int item){

        /*

            Algo: If root ==null,enter root
            if item < root travese left subtree recursively base case root.left==null and
            if item > root travserse right subtree recursivley base case root.right==null


        */

       if(root==null) {root=new node(item);}

       //System.out.print(item+"  added");

       if(root.d>item) root.left=insert(root.left,item);

        if(root.d<item) root.right=insert(root.right,item);

        return root;




}

public static void inorder(node root){

    if(root==null) return;
    inorder(root.left);
    System.out.println(root.d);
    inorder(root.right);

}

public static void delete(node root){

}

public static boolean search(node root,int item){

    boolean flag=false;
    if(root==null) {flag=false;return flag;}
    if(root.d==item) flag=true;
    if(item>root.d) flag=search(root.right, item);
    if(item<root.d)  flag=search(root.left,item);


    return flag;
}




  node root;

  bst(){
    root=null;
  }

  public static void main(String[] args){

    bst b=new bst();
    b.root=new node(8);
    insert(b.root,b.root.d);
    insert(b.root, 3);
    insert(b.root,10);
    insert(b.root,1);
    insert(b.root,6);
    insert(b.root,14);
    insert(b.root,4);
    insert(b.root,7);
    insert(b.root,13);

    inorder(b.root);

    System.out.println(search(b.root, 13));


  }

}
