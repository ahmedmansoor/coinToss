package coinTossAssignment;

// 4. Create a CoinToss class that implements Runnable interface
public class CoinToss implements Runnable {

	public static CoinCollection coinCollection;
	private float coinsAddedInRF = 0f;
	private float coinsTakenInRF = 0f;
	private float currentBalance;
	private int coins;
	
	@Override
	// 6. In the run() method of the CoinToss class, the method openTheCoinCollection () will be called
	public void run() {
		synchronized(coinCollection) {
			openTheCoinCollection();
		}
	}

	public void setCoinsAddedInRF(float coins_added) {
		coinsAddedInRF = coins_added;
	}

	public void setCoinsTakenInRF(float coins_taken) {
		coinsTakenInRF = coins_taken;
	}
	
	public void setNumberOfCoinsTaken(int no_of_coins_taken) {
		coins = no_of_coins_taken;
	}

	// 5. Create a method called openTheCoinCollection()
	private void openTheCoinCollection() {

		// retrieve Current Balance of coin collection
		currentBalance = coinCollection.getBalance();

		// modify coin balance by deducting the coins amount taken, and adding the coins added
		for(int i=0; i<coins; i++) {	
			currentBalance += coinsAddedInRF - coinsTakenInRF;
		}

		// assign to balance variable 
		coinCollection.setBalance(currentBalance);
	}
}
