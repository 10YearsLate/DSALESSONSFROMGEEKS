/*

When to use Binary Indexed Tree?

Before going for Binary Indexed tree to perform operations over range, one must confirm that the operation or the function is:

Associative. i.e f(f(a, b), c) = f(a, f(b, c)) this is true even for seg-tree

Has an inverse. eg:

addition has inverse subtraction (this example we have discussed)

Multiplication has inverse division

gcd() has no inverse, so we can’t use BIT to calculate range gcd’s

sum of matrices has inverse

product of matrices would have inverse if it is given that matrices are degenerate i.e. determinant of any matrix is not equal to 0

Space Complexity: O(N) for declaring another array of size N

Time Complexity: O(logN) for each operation(update and query as well)*/


public class BIT{
	
	static int[] a={1,2,3,4,5,2,2,3};
	static int[] bit=new int[a.length+1];
	
	public static void update(int index,int val){
	
		while(index<=a.length){
			
			bit[index]+=val;
			index += index & (-index);
			
		}
	
	
	}
	
	public static int sum (int index){
		int sum=0;
		
		while(index>0){
			
			sum +=bit[index];
			index -= index &(-index);
			
		}		
		return sum;
		
	}
	
	public static void main(String[] args){
		
		for(int i=0;i<a.length;i++){
			
			update(i+1,a[i]);
		}
		
		for(int i :a)System.out.print(i+" ");
		System.out.println("");
		for(int i :bit)System.out.print(i+" ");
		System.out.println("Sum of first 4 elements "+sum(4));
		System.out.println("Sum of element from 3..6 "+(sum(6)-sum(2)));
		
	}
	
}
