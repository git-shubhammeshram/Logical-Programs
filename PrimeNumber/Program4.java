package PrimeNumber;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int count = 0;
		
		for (int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Not prime");
		}
		else {
			System.out.println("is prime");
		}

	}

}
