package RandomNumber;

import java.util.Random;

public class Program3 {
	public static void main(String[] args) {
		int num;
		Random valueRandom = new Random();
		num = valueRandom.nextInt(100);
		System.out.println(num);
	}

}
