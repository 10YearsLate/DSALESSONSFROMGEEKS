public class sumofnum{

        public static void sum(int num,int carry){

            int sum=(num%10)+carry;

            if(num/10==0) System.out.print(sum);
            else sum(num/10,sum);
        }
        public static void main(String[] args){

            sum(987,0); //tail recusrion
        }
}