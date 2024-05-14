import java.io.*;
import java.util.Scanner;

public class BankMain
{

	public static void main(String[] args)
	{
		int nAccountHolders = 0;
		int AccID = 0;
		String AccHolderName = "";
		float AccBalance = 0;
		
		Scanner getValue = new Scanner(System.in);
		BankingSystem bs = new BankingSystem();
		
		bs.addAccountHolder(new AccountHolder(1,"Dharsha",105610));
		bs.addAccountHolder(new AccountHolder(2,"Harini",563250));
		bs.addAccountHolder(new AccountHolder(3,"Dharshu",597621));
		bs.addAccountHolder(new AccountHolder(4,"Lithu",756266));
		bs.addAccountHolder(new AccountHolder(5,"Pooja",466233));
		bs.addAccountHolder(new AccountHolder(6,"Dhanu",862432));
		bs.addAccountHolder(new AccountHolder(7,"Murshi",465321));
		
		System.out.println("Account Holders Information: ");
		bs.viewAccountHolders();
		System.out.println("1.Send Money\t2.Check Balance \t3.Exit");
		int getOperations = getValue.nextInt();
		switch (getOperations) {
		case 1:
			System.out.println("Enter your ID: ");
			int getAID = getValue.nextInt();
			System.out.println("Enter the amount to be sent: ");
			float sentMoney = getValue.nextFloat();
			AccountHolder objAccountHolder = bs.searchAccountHolderByID(getAID);
			if(objAccountHolder != null) {
				float balance = objAccountHolder.getAccBalance();
				if(balance > sentMoney) {
				balance = balance - sentMoney;
				System.out.println("Money sent successfully");
				System.out.println("What to check Balance?");
				System.out.println("1.Yes\t2.No");
				int checkbalance = getValue.nextInt();
				if(checkbalance == 1) {
					System.out.println("Your Balance: "+balance);
				}
				else if(checkbalance ==2) {
					System.out.println("Thank You");
				}
				}
				else {
					System.out.println("Invalid Balance");
				}
			}
			break;
		case 2:
			System.out.println("Enter your ID: ");
			int getAID1 = getValue.nextInt();
			AccountHolder objAccountHolder1 = bs.searchAccountHolderByID(getAID1);
			if(objAccountHolder1 != null) {
				float balance1 = objAccountHolder1.getAccBalance();
				System.out.println("Balance: "+balance1);
		}
			break;
		case 3:
			System.out.println("Thank you");
			break;
	}

}
}
