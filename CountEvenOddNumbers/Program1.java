package CountEvenOddNumbers;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		int num = 256819 ;
		int evenCount = 0;
		int oddCount = 0;
//		System.out.println("Enter the value = ");
//		Scanner userValue = new Scanner(System.in);
//		num = userValue.nextInt();
		
		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num = num/10;
		}
		System.out.println("Even num counts are = "+ evenCount);
		System.out.println("Odd num counts are = " + oddCount);
	}


}
