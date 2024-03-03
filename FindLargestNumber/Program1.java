package FindLargestNumber;

public class Program1 {


	public static void main(String[] args) {
		int a = 200;
		int b = 300;
		int c = 400;
		
		if(a>b && a>c)
		{
			System.out.println(a + " Is a largest number");
		}
		else if (b>a && b>c) 
		{
			System.out.println(b +" Is a largest number");
		}
		else
		{
			System.out.println(c + " Is a largest number");
		}
	}



}
