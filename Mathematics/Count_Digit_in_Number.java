
import java.lang.Math;

public class Count_Digit_in_Number{


	public static int count_digit(int a){

		if(a==0) return 0;
		else return(1+count_digit(a/10));

	}


	public static void main(String[] args){


		int a=349;
		int count=0;

		while(a/10>0){

			count++;
			a=a/10;

		}
		System.out.println("Count from Iterative solution  "+(count+1));
		
		System.out.println("Count from recursive solution  "+count_digit(349));

		
		System.out.println("Count from logarithmic solution  "+(1+Math.floor(Math.log10(349))));
		

		

	}

}