package CountEvenOddNumbers;

public class Program3 {

	public static void main(String[] args) {

		int num = 123456789;
		int evenCount = 0;
		int oddCount = 0;
		int rem;
		
		while(num>0)
		{
			rem = num%10;
			if(num%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num = num/10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		
		
		
	}

}
