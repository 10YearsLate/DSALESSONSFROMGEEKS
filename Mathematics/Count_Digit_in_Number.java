
import java.lang.Math;

public class Count_Digit_in_Number{


	public static int count_digit(int a){

		if(a==0) return 0;
		else return(1+count_digit(a/10));

	}


	public static float Celcius_Farenhite(int celcius){

		return ((celcius/5)*9)+32;

	}

	public static void find_quadratic_root(int a,int b,int c){

		double discriminant= Math.sqrt(Math.pow(b,2)-(4*a*c));

		double first_root=(b*(-1) + discriminant)/(2*a);

		double second_root=(b*(-1) - discriminant)/(2*a);

		double[] root= {first_root ,second_root};
		for(int i=0;i<root.length;i++){
			System.out.println(root[i]);
		}

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


		System.out.println("This is how you print absolute value "+Math.abs(-3));

		
		System.out.println("This happens when you convert 50C 2 F  "+ Celcius_Farenhite(50));

		find_quadratic_root(1,2,1);



		

		

	}

}