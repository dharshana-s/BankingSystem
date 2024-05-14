
public class AccountHolder 
{
	private int AccID ;
	private String AccHolderName;
	private float AccBalance;
	
	public AccountHolder(int AccID, String AccHolderName, float AccBalance)
	{
		this.AccID = AccID;
		this.AccHolderName = AccHolderName;
		this.AccBalance = AccBalance;
	}
	public int getAccID() {
		return AccID;
	}
	public void setAccID(int AccID)
	{
		this.AccID = AccID;
	}
	public String getAccHolderName() {
		return AccHolderName;
	}
	public void setAccHolderName(String AccHolderName) {
		this.AccHolderName = AccHolderName;
	}
	public float getAccBalance() {
		return AccBalance;
	}
	public void setAccBalance(float AccBalanceD)
	{
		this.AccBalance = AccBalance;
	}
	
	@Override
	public String toString() {
		return "Account Number: "+ AccID + "\tAccount Holder Name: "+ AccHolderName+ "\tBalance: "+AccBalance;
	}
	
}
