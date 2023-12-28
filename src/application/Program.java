package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int n = input.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Type a number: ");
			numbers[i] = input.nextInt();
		}
		
		System.out.println("Negative numbers:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
					System.out.println(numbers[i]);
			}
		}
		
		input.close();

	}

}
