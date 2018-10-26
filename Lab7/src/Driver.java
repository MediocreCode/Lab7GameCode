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
 * 10/26
 */
	Button start = new Button();
	static Stage myStage = new Stage();
	GameSceneFX gameScene = new GameSceneFX();
	HomeScreenGraphic hsg = new HomeScreenGraphic();
	static CoinItem coin = new CoinItem();
	Player p1 = new Player();
	java.awt.Graphics g;
	Scene gameSceneScene;
	
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
		//coin.makeCoin(g);
		String name = new String();
		name = hsg.getPlayerName();
		gameScene.getText(name);
		p1.setScale();
		gameScene.getGroup(p1.getPlayerImg());
		gameSceneScene = gameScene.getScene();
		gameSceneScene.setOnKeyPressed(this::keyMove);
		myStage.setScene(gameSceneScene);
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
}
