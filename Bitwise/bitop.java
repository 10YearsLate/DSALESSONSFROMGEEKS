public class bitop{


    public static void main(String[] args){

        /*

        101 ---- 5
        111 ---- 7
        -----
        101 ----5 . (Bit wise And
        
        */
        
        System.out.println(5&7);

       /*

        101 ---- 5
        111 ---- 7
        -----
        111 ----7 . (Bit wise OR
        
        */
        System.out.println(5|7);
        /*

        101 ---- 5
        111 ---- 7
        -----
        010 ----2. (Bit wise XOR
        
        */
        System.out.println(5^7);
        /*

        101 . --5
        ~
         64 bit . 1111111111.....010
        
        */
        System.out.println(~5);
        /*

        101>>2

        0000000001 =1
        
        */
        System.out.println(5>>2);
        System.out.println(5<<2); //multiply by 2pow 2

        //2s complement 2^32 -2 is for -2

    }
}