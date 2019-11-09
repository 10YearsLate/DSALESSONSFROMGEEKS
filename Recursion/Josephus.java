public class Josephus{

  public static int joseutil(int n,int k){
  
      if(n==1) return n;
      else {
        int op=((joseutil(n-1,k))%n)+1;
      }
  
  }

  public static void main(String[] args){
  
      System.out.println(joseutil(3,2));
  }

}
