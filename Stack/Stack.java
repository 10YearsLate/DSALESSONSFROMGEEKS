public class stack{

  int size=100;
  int[] arr;
  int top;
  
  Stack(){
    arr=new int[size];
    top=-1;
   
  }
  
  private void push(int a){
  
      arr[++top]=a; //ignoring stack overflow
  }
  
  private int pop(){
  
      return arr[--top];
  }
  
  private int peak(){
    return arr[top];
  }
  
  
  public static void main(String[] args){
  
    stack st=new stack();
    st.push(4);
    st.push(3);
    st.push(2);
    st.push(1);
    
    while(top>0){
      System.out.print(st.pop());
    }
  }
  

}
