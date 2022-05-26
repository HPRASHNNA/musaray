package test;

import java.util.Scanner;

public class test  {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the count ");
		int count =scan.nextInt();
		for(int i= 1 ; i<= count ; i++)
		{
			
			for (int j= 1 ; j <= count ;j++)
			{
				System.out.print("* \n");
			}
			System.out.print(" * ");
		}
	System.out.println("  ");
	}

}
