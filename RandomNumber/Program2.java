package RandomNumber;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {

		int num;
		
		Random value = new Random();
		num = value .nextInt(100);
		System.out.println(num);
	}

}
