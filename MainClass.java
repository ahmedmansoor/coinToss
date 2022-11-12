package coinTossAssignment;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

// 7. In the main function of your project, carry out the following: 
public class MainClass {

	public static void main(String[] args) {
		
		// Create an example Owner with a nick name and full name. 
		Owner owner = new Owner("Mante", "Ahmed");

		// Create a Coin Collection for this Owner. 
		CoinCollection coinCollection = new CoinCollection(100f, owner);
		
		// Takes 10 coins of 2RF coin,
		CoinToss coinTossOne = new CoinToss();
		CoinToss.coinCollection = coinCollection;
		coinTossOne.setCoinsTakenInRF(2f);
		coinTossOne.setNumberOfCoinsTaken(10);

		// and 5 coins of 1RF coin from the coin collection 
		CoinToss coinTossTwo = new CoinToss();
		coinTossTwo.setCoinsTakenInRF(1f);
		coinTossTwo.setNumberOfCoinsTaken(5);
		
		// Adds 12 coins of 2RF,
		CoinToss coinTossThree = new CoinToss();
		coinTossThree.setCoinsAddedInRF(2f);
		coinTossThree.setNumberOfCoinsTaken(12);
		
		// and 10 coins of 1RF to the coin collection
		CoinToss coinTossFour = new CoinToss();
		coinTossFour.setCoinsTakenInRF(1f);
		coinTossFour.setNumberOfCoinsTaken(10);
		
		// 8. Show how the concurrent running of these two CoinTosses could lead to an inconsistent balance and
		// suggest and show how this can be solved using Java Thread properties.
		ExecutorService coinHandler = Executors.newFixedThreadPool(4);
		
		coinHandler.execute(coinTossOne);
		coinHandler.execute(coinTossTwo);
		coinHandler.execute(coinTossThree);
		coinHandler.execute(coinTossFour);
		
		coinHandler.shutdown();
		
		System.out.println(coinCollection.getBalance());
	}

}
