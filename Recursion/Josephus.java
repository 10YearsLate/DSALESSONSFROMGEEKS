/*

41=2^5+9  answer . 2^9+1=19
*/

public class Josephus{

  public static int joseutil(int n,int k){

      if(n==1) return n;
      else {
        int op=((joseutil(n-1,k)+k-1)%n)+1;
        return op;
      }

  }

  public static void main(String[] args){

      System.out.println(joseutil(41,2));
  }

}
