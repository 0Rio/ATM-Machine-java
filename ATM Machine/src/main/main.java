package main;

import java.util.Scanner;

public class main 
{
	 private static int[] acc = {8080897, 3293724, 8920910, 1294733, 9878677};
	final private static int[] pass = {2087, 7068, 9075, 3719, 3874};
	static int accNo = 0, pas = 0;;
	static int bal = 0;
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
			System.out.println("Invalid Account Number or Pin\n \n");
			input();
		}
		else
		{
			if(!check())
			{
				System.out.println("Invalid Account Number or Pin\n\n");
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
	System.out.println("Select the Account you want to access");
	System.out.println("Type 1 - Checking Account");
	System.out.println("Type 2 - Saving Account");
	System.out.println("Type 3 - Exit");
	System.out.print("Choice: ");
	int choice = in.nextInt();
	if(choice == 1)
	{
		Acc("Checking Account");
	}
	else if(choice == 2)
	{
		Acc("Saving Account");
	}
	else if(choice == 3)
		return;


	else
	{
		System.out.println("Invalid Choice\n");
		atm();
	}
}


private static void Acc(String accNa)
{
	System.out.println(accNa+":");
	System.out.println("Type 1 - View Balance");
	System.out.println("Type 2 - Withdraw Funds");
	System.out.println("Type 3 - Deposit Funds");
	System.out.println("Type 4 - Exit");
	System.out.print("Choice: ");
	int choice = in.nextInt();
	if(choice == 1)
	{
		System.out.println(accNa+" Balance: $"+(float)bal);
		atm();
	}
	else if(choice == 2)
	{
		System.out.print("Ammount which you want to Withdraw: ");
		withdraw(accNa);
	}
	else if(choice == 3)
	{
		System.out.print("Ammount which you want to Deposit: ");
		deposit(accNa);
	}
	else if(choice == 4)
	{
		return;
	}
	else 
	{
		System.out.println("Invalid Choice\n");
		Acc(accNa);
	}
}


private static void deposit(String accNa) 
{
	int amt = in.nextInt();
	
	bal += amt;
	System.out.println("New "+accNa+" balance: $"+(float)bal);
	atm();
}


private static void withdraw(String accNa) 
{

	int amt = in.nextInt();
	
	if(amt > bal)
	{
		System.out.println("Insufficient balance");
	}
	else
	{
		bal -= amt;
		System.out.println("New "+accNa+" balance: $"+(float)bal);
	}
atm();
}



}







