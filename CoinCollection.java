package coinTossAssignment;

// 2. Create a CoinCollection class
public class CoinCollection {
	
	private float collectionBalance;
	public Owner owner;
	
	// 3. Create the default constructor
	public CoinCollection(float _collectionBalance, Owner _owner) {
		
		collectionBalance = _collectionBalance;
		owner = _owner;
	}
	
	public float getBalance() {
		
		return collectionBalance;
	}
	
	public void setBalance(float _balance) {
		
		collectionBalance = _balance;
	}
}
