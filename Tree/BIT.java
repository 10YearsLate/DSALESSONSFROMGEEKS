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
