import java.lang.Systems.*;

public class Fibonnaci{


  public static int fibonnaci(int N){
  
        if(N==1 ||N==2) return 1;
        else return (fibonnaci(N-1)+fibonacci(N-2));
     
  }
  public static void main(String[] args){
  
      int N=5;
      int output=fibonnaci(N);
  
  }


}

