import java.lang.System.*;
import java.util.*;

public class Fibonnaci{

    static int[] dp=new int[5000];
    //Arrays.fill(dp,-1);

    public static int fibodp(int N){   //0 ms

        if(dp[N]!=0) return dp[N];
        else{
            if(N==1||N==2) dp[N]=1;
            else{
                dp[N]=fibodp(N-1)+fibodp(N-2);

            }

        }
        return dp[N];

    }


  public static int fibonnaci(int N){     //398 ms
  
        if(N==1 || N==2) return 1;
        else return (fibonnaci(N-1)+fibonnaci(N-2));
     
  }
  public static void main(String[] args){
     
      long start=System.nanoTime();
      int N=4990;
      //int output=fibonnaci(N);
      int output=fibodp(N);
      System.out.println(output);
      long end=System.nanoTime();
      //long time=(end-start); ///1000F;
      System.out.println("Took: " + ((end - start) / 1000000) + "ms");

  
  }


}

