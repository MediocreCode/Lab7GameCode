import javafx.scene.image.Image;
/*
 * Raleigh Dial
 * 10/19
 */
public class Player {

		int x1;
		int x2;
		int y1;
		int y2;
		String playerName;
		Image playerImg;

		//Takes player name from HomeScreen TextField
public Player(String playerName) {
	this.playerName = playerName;
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
		public Image getPlayerImg() {
			return playerImg;
		}
		public void setPlayerImg(Image playerImg) {
			this.playerImg = playerImg;
		}
}
