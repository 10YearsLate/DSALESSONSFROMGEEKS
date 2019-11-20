import java.util.*;
import java.io.*;

public class prob1{

    public static void main(String[] args){
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while(true){
            int n=sc.nextInt();
            if(n==42) break;
            else System.out.println(n);
        }
    }
}