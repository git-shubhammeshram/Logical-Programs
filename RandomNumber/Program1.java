package RandomNumber;

import java.util.Random;

public class Program1 {


	public static void main(String[] args) {
		
		int num ;
		double num1;
		
		Random value = new Random();
		num = value.nextInt(20);
		System.out.println("Random values are = " + num);
		
		num1 = value.nextDouble();
		System.out.println("Random values are "+ num1);
	}



}
