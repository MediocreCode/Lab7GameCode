import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Enemy {
/*
 * Raleigh Dial
 * 10/29
 * 
 */
	int x1=600;
	int x2=632;
	int y1=400;
	int y2=420;
	Image enemyImg = new Image("file:src/Enemy.png");
	ImageView enemyView = new ImageView(enemyImg);
	//String enemyName; Does enemy need name?
	
	public void moveRight() {
		x1+=8;
		x2+=8;
		enemyView.setX(x1);
	}
	public void moveLeft() {
		x1-=8;
		x2-=8;
		enemyView.setX(x1);
	}
	public void moveUp() {
		y1-=8;
		y2-=8;
		enemyView.setY(y1);
	}
	public void moveDown() {
		y1+=8;
		y2+=8;
		enemyView.setY(y1);
	}
	public ImageView getEn() {
		enemyView.setX(x1);
		enemyView.setY(y1);
		enemyView.setScaleX(.5);
		enemyView.setScaleY(.5);
		return enemyView;
	}
	
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
}
