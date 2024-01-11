package com.streams.jan11;

import java.util.Scanner;

public class SquarePattern 
{
	public void printPattern(int number)
	{
		for(int row =1;row<=number;row++)
		{
			for(int column=1;column<=number;column++)
			{
				if(column==1 || row==1 || column==number || row==number)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		new SquarePattern().printPattern(number);
		scanner.close();
	}
}
