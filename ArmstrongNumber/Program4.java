package ArmstrongNumber;

public class Program4 {

	public static void main(String[] args) {
		int num = 371;
		int armNum = num;
		int value;
		int sum = 0;
		
		while(num>0)
		{
			value = num%10;
			num = num/10;
			sum = sum + value*value*value;
			
		}
		System.out.println(sum);
		if(armNum==sum)
		{
			System.out.println("Armstorng");
		}
		else 
		{
			System.out.println("Not armstrong");
		}
	}

}
