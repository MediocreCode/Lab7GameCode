import javafx.scene.image.Image;

public class Enemy {
/*
 * Raleigh Dial
 * 10/29
 * 
 */
	static int x1;
	int x2;
	int y1;
	int y2;
	Image enemyImg;
	//String enemyName; Does enemy need name?
	
	//Getters and Setters
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public Image getEnemyImg() {
		return enemyImg;
	}
	public void setEnemyImg(Image enemyImg) {
		this.enemyImg = enemyImg;
	}
}
