package main;

import java.util.Scanner;

public class main 
{
	 private static int[] acc = {8080897, 3293724, 8920910, 1294733, 9878677};
	final private static int[] pass = {2087, 7068, 9075, 3719, 3874};
	static int accNo = 0, pas = 0;;
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		input();
	}
	
	
	private static void input() 
	{
		
		System.out.print("Enter your Account Number: ");
		accNo = in.nextInt();
		System.out.print("Enter your Pin Number: ");
		pas = in.nextInt();
		Invalid();
	}


	


	private static void Invalid() 
	{
		int Alength = Integer.toString(accNo).length();
		int paLength = Integer.toString(pas).length();
		if(!(paLength == 4) || !(Alength == 7) )
		{
			System.out.println("Invalid Account Number or Pin");
			input();
		}
		else
		{
			if(!check())
			{
				System.out.println("Invalid Account Number or Pin");
				input();
			}
		}
		
	}
	
private static Boolean check() 
	{
	
	for (int i = 0, length = acc.length; i < length; i++)
	{
		if(acc[i] == accNo && pass[i] == pas)
		{
			atm();
			return true;
		}
	}
		return false;	
	}


private static void atm() 
{
	
	
}
}







