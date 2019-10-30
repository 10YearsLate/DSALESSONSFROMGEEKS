/*Prime number can always be represented as 6n+1 or 6n-1 except 2 & 3*/
import java.lang.Math;
public class primality{

	public static void main(String[] args){

		for (int i=0;i<args.length;i++){

			System.out.println(args[i]);
		}

		int number=5437;
        boolean prime=true;
		//if((number-1)%6==0 || (number+1)%6==0 || number==2 ||number==3) Bug found not working for 35
        for(int i=2;i<=Math.sqrt(number);i++){

            //System.out.println(Math.sqrt(number));

            if(Math.floor(Math.sqrt(number))%i==0){

                if(number%i==0){

                    System.out.println(number+" Number is not Prime "+ i);
                    prime=false;
                    break;
                }
            }
        }
			if(prime) System.out.println("Number is Prime");

	}


}