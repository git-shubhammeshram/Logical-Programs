package CountNumberDigits;

public class Program2 {

	public static void main(String[] args) {
		int num = 907558;
		int count = 0;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
		
	}

}
