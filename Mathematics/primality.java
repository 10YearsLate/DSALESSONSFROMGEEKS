/*Prime number can always be represented as 6n+1 or 6n-1 except 2 & 3*/

public class primality{

	public static void main(String[] args){

		for (int i=0;i<args.length;i++){

			System.out.println(args[i]);
		}

		int number=57;

		if((number-1)%6==0 || (number+1)%6==0 || number==2 ||number==3)
			System.out.println("Number is Prime");
		else	System.out.println("Number is not Prime");



	}


}