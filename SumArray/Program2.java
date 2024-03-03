package SumArray;

public class Program2 {

	public static void main(String[] args) {
		int ary[] = {2,5,8,9,1,3};
		int sum = 0;
		
		for(int i=0; i<ary.length; i++)
		{
			sum = sum + ary[i];
		}
		System.out.println(sum);
	}

}
