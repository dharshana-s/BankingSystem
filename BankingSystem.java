import java.util.ArrayList;
import java.util.List;

public class BankingSystem
{
	private List<AccountHolder> accountholders = new ArrayList<>();
	
	//Create or add customer details
	public void addAccountHolder(AccountHolder accountholder) {
		accountholders.add(accountholder);
	}
	public void viewAccountHolders() {
		accountholders.forEach(System.out::println);
	}
	public AccountHolder searchAccountHolderByID(int AccID) {
		for(AccountHolder a : accountholders) {
			if(a.getAccID()== AccID) {
				return a;
			}
		}
		return null;
	}
}
