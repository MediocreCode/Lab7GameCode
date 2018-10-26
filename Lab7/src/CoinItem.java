import java.awt.Color;
import java.util.Random;
/*
 * Raleigh Dial
 * 10/25
 * Looks good but breaks
 */

public class CoinItem {
	Random r = new Random();
	int coinX;
	int coinY;
	int h=15;
	int w=15;
//Gens coins X position	
public int genCoinX() {
	coinX = r.nextInt(751);
	return coinX;
}
//Gens coin Y position
public int genCoinY() {
	coinY = r.nextInt(501);
	return coinY;
}
public void makeCoin(java.awt.Graphics g) {
	g.setColor(Color.WHITE);
	g.drawRect(genCoinX(), genCoinY(), w, h);
	
}
}
