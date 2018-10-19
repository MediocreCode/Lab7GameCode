import java.util.Random;
/*
 * Raleigh Dial
 * 10/19
 */

public class CoinItem {
	Random r = new Random();
	int coinX;
	int coinY;
//Gens coins X position	
public int genCoinX() {
	coinX = r.nextInt(500);
	return coinX;
}
//Gens coin Y position
public int genCoinY() {
	coinY = r.nextInt(500);
	return coinY;
}
}
