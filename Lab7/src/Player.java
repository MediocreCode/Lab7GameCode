import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/*
 * Raleigh Dial
 * 10/19
 */
public class Player {

		int x1=100;
		int x2;
		int y1=100;
		int y2;
		String playerName;
		Image playerImg = new Image("file:src/Player.jpg");
		ImageView playerView = new ImageView(playerImg);

		//Takes player name from HomeScreen TextField
public void moveRight() {
	x1+=5;
	playerView.setX(x1);
}
public void moveLeft() {
	x1-=5;
	playerView.setX(x1);
}
public void moveUp() {
	y1-=5;
	playerView.setY(y1);
}
public void moveDown() {
	y1+=5;
	playerView.setY(y1);
}
public void setScale() {
	playerView.setScaleX(.1);
	playerView.setScaleY(.1);
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
		public String getPlayerName() {
			return playerName;
		}
		public ImageView getPlayerImg() {
			return playerView;
		}
		public void setPlayerImg(Image playerImg) {
			this.playerImg = playerImg;
		}
}
