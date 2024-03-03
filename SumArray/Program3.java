package SumArray;

public class Program3 {

	public static void main(String[] args) {
		
		int ary[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int i=0; i<ary.length; i++)
		{
			sum = sum + ary[i];
		}
		System.out.println(sum);
	}

}
