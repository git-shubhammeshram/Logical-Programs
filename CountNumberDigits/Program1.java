package CountNumberDigits;

public class Program1 {
	


	public static void main(String[] args) {

		int num = 9858290;
		int count = 0;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Number are in digits = " + count);
	}


}
