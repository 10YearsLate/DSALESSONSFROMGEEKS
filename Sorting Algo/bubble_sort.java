/*


Date:
Author:

Algorithm:

1.i-0..n-1 Iterate over the Array for n item
2.j=0..n-i iterate over the array for n-i item
2.Check with adjacent ,if Left > Right Swap else skip

1st inner loop

10  9  8  0
=>9 10 8 0
==>9 8 10 0
===>9 8 0 10

2nd inner loop end with

8 0 9 10

3rd inner loop end

0 8 9 10

Test Case:


i/p: 0 1 2 3
o/p:
Test

i/p:
o/p:


*/

import java.util.*;

public class bubble_sort{

	public static void swap(int[] a, int i,int j){

		int temp=a[i];
		a[i]=a[j];   //bug fixed
		a[j]=temp;

	}

	public static int[] bubble_worst(int[] a){

		for(int i=0;i<a.length;i++){

			for(int j=0;j<a.length-i-1;j++){

			if(a[j] > a[j+1]) swap(a,j,j+1);
			}

		}
		return a;

	}

	public static void main(String[] args){

	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number of element");
	int N=s.nextInt();
	int[] a=new int[N];
	System.out.println("Enter elements to be sorted");
	for(int i=0;i<a.length;i++){
		a[i]=s.nextInt();
	}

	bubble_worst(a);
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+ " ");
	}

	}


}

/*Bugs:

1.swap does not have a return type - need to review the code
2.Package not imported
2.typo in class
3.Another bug is passing argument in swap

*/
