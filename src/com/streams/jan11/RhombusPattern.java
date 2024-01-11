package com.streams.jan11;

import java.util.Scanner;

public class RhombusPattern 
{
	public void printPattern(int number)
	{
		for(int row =0;row<number;row++)
		{
			for(int space=0;space < number-row;space++){
				System.out.print(" ");
			}
			for(int column=0;column<=row;column++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row =0;row<number;row++)
		{
			if(row==0)
				continue;
			for(int space=0;space <=row;space++){
				System.out.print(" ");
			}
			for(int column=0;column<number-row;column++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		new RhombusPattern().printPattern(number);
		scanner.close();
	}
}
