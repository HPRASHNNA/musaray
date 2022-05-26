package test;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("count  ");

		int count = scan.nextInt();

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {

				if (i == 0 || j == count / 2)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}