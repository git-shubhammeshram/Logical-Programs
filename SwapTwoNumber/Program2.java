package SwapTwoNumber;

public class Program2 {

	public static void main(String[] args) {

		int a = 200;
		int b = 400;
		
		System.out.println(a + " " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + " " + b);
	}

}
