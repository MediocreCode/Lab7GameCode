import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application {
/*
 * Raleigh Dial
 * Trevor Henry
 * 10/29
 * 
 */
	Button start = new Button();
	static Stage myStage = new Stage();
	GameSceneFX gameScene = new GameSceneFX();
	HomeScreenGraphic hsg = new HomeScreenGraphic();
	static SheepItem shep1 = new SheepItem();
	static SheepItem shep2 = new SheepItem();
	static SheepItem shep3 = new SheepItem();
	static SheepItem shep4 = new SheepItem();
	static SheepItem shep5 = new SheepItem();
	Player p1 = new Player();
	java.awt.Graphics g;
	Scene gameSceneScene;
	static String name = new String();
	
	public static void main(String[] args) {
		launch (args);

	}
	public void start(Stage primaryStage) throws Exception {
		this.myStage = primaryStage;
		
		hsg.getHomeText();
		hsg.getHomeTF();
		hsg.getStart();

		start = hsg.getStart();
		start.setOnAction(this::startGame);
		
		Group myGroup = hsg.getGroup();// Testing to make sure HomeScreen works
		Scene myScene = new Scene(myGroup, 750, 500, Color.BLACK);
		myStage.setTitle("Game");
		myStage.setScene(myScene);
		myStage.show();

	}
	public void startGame(ActionEvent args) {//Starts game-ish
		name = hsg.getPlayerName();
		gameScene.getText(name);
		p1.setScale();
		shep1.genCoinX();
		shep1.genCoinY();
		shep1.makeShep();
		gameScene.getGroup(p1.getPlayerImg(),shep1.getShep());
		gameSceneScene = gameScene.getScene();
		gameSceneScene.setOnKeyPressed(this::keyMove);
		myStage.setScene(gameSceneScene);
		if(areRectsColliding(p1.getX1(), p1.getX2(), p1.getY1(), p1.getY2(), shep1.getCoinX(), shep1.getW(), shep1.getCoinY(), shep1.getH())) {
			gameScene.changeCounter();
			System.out.println("Works!");
		}
	}
	public void keyMove(KeyEvent event) {
		KeyCode myCode = event.getCode();
		if(myCode== KeyCode.A) {
			p1.moveLeft();
		}
		else if(myCode== KeyCode.D) {
			p1.moveRight();
		}
		else if(myCode== KeyCode.W) {
			p1.moveUp();
		}
		else if(myCode== KeyCode.S) {
			p1.moveDown();
		}
	}
	private boolean areRectsColliding(int r1TopLeftX, int
			r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int
			r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int
			r2BottomRightY)
			{
			if (r1TopLeftX < r2BottomRightX && r1BottomRightX >
			r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY >
			r2TopLeftY) 
			{
			return true;
			}
			else
			{
			return false;
			}
			}
}
