package SumDigits;

public class Program1 {
	
	public static void main(String[] args) {
		int num = 1298;
		int sum = 0;
		
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("Sum of given number is = "+ sum);
	}


}
