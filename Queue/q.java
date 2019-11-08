public class q{

  int front,rear;
  int size;
  int[] a;
  
  q(int s){
    size=s;
    front=-1;
    rear=-1;
    a=new int[size];
  }
  
  private void enq(int item){
  
    if(front==-1){
      front++;rear++;
      a[front]=item;
      size++;
    }
    else{
      rear++;
      a[rear]=item;
    }
   
   private int dq{
   
   int op=a[front];
   front++
   
   
   }
    
  
  }

  public static void main(String[] args){
      
      q qds=new q();
      q.enq(4)
      q.dq();
      
  }
}
