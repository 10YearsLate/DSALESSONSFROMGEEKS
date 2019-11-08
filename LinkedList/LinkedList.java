public class LinkedList{

  Node Head;

  class Node{

    int data;
    Node next;

    Node(int d){

      data=d;
    }
  }

  LinkedList(){
      Head=null;
  }

  public void insert(LinkedList ll,int item){
      if(ll.Head==null){
          ll.Head=new Node(item);
          ll.Head.next=null;

      }
      else{
          Node current=Head;
          while(current.next!=null) current=current.next;
          current.next=new Node(item);
          current=current.next;
          current.next=null;
      }
  }

  public void print(LinkedList ll){
      if(ll.Head==null) return;
      Node current=Head;
      while(current!=null){
          System.out.print(current.data+ "  ");
          current=current.next;
      }


  }

  public void reverse(){
      Node p=null;
      Node c=Head;
      Node n=c.next;

      while(n!=null){
        Node item=n.next;
        n.next=c;
        c.next=p;
        p=c;
        c=n;
        n=item;
  }

  Head=c;


  }

  public static void main(String[] args){
      LinkedList ll=new  LinkedList();
      ll.insert(ll, 5);
      ll.insert(ll, 2);
      ll.insert(ll, 1);
      ll.insert(ll, 7);
      ll.insert(ll, 3);

      ll.print(ll);

      ll.reverse();

      ll.print(ll);

  }

}
