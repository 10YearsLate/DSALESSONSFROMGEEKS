public class factorial{


	public static int factorial(int n){

		if(n==1 || n==0) return 1;
		else return n*factorial(n-1);


	}

	public static double find_nth_gp(int a,int b,int n){

		int r=b/a;

		return (a* Math.pow(r,n-1));
	}


	public static void main(String[] args){

		System.out.println(factorial(5));

		System.out.println("4 th term of GP Series 3,6,12... is "+find_nth_gp(3,6,4));
	}


}