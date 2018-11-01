import java.awt.Color;
import java.util.Random;
/*
 * Raleigh Dial
 * 10/25
 * Looks good but breaks
 */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/*
 * Raleigh
 * 10/29
 */
public class SheepItem {
	Random r = new Random();
	static int coinX;
	static int coinY;
	int h=32;
	int w=32;
	Image shepImg = new Image("file:src/Shep.png");
	ImageView shepView = new ImageView(shepImg);
//Gens coins X position	
public void genCoinX() {
	coinX = r.nextInt(700);
	w = 32;
	w = (coinX + w);
	System.out.println(w);
}
//Gens coin Y position
public void genCoinY() {
	coinY = r.nextInt(450);
	h = 32;
	h = (coinY + h);
	System.out.println(h);
}
public int getH() {
	return h;
}
public void setH(int h) {
	this.h = h;
}
public int getW() {
	return w;
}
public void setW(int w) {
	this.w = w;
}
public void makeShep() {
	shepView.setX(coinX);
	shepView.setY(coinY);
}
public ImageView getShep() {
	return shepView;
}
public int getCoinX() {
	return coinX;
}
public int getCoinY() {
	return coinY;
}
}
