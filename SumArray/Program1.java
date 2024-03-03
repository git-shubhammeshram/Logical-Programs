package SumArray;

public class Program1 {


	public static void main(String[] args) {
		int ary[] = {2,4,8,9,5};
		int sum = 0;
		
		for(int i=0;i<ary.length-1;i++)
		{
			sum = sum + ary[i];
		}
		System.out.println("Sum of array are = " + sum);
	}



}
