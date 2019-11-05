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

public class node{

  int d;
  node left;
  node right;
  node(int data){
  
    d=data;
    
    }
    

}

public static void insert(node root,int item){

  if(root==null) root=new node(item);
  
  if(item>root) insert(root.right,item);
  if(item<root) insert(root.left,item);

}

public static void inorder(node root){

    if(root==null) return;
    inorder(root.left);
    SYstem.out.println(root.d);
    inorder(root.right);

}

public static void delete(node root){

}


public class bst{

  node root;
  
  bst(){
    root=null;
  }

  public static void main(String[] args){
  
    bst b=new bst();
    b.root=new node(2);
    insert(b.root);
    insert(new node(1));
    insert(new node(3));
    
    inorder(b.root);
  
  
  }

}
