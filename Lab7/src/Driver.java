import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application {
/*
 * Raleigh Dial
 * Trevor Henry
 * 10/20
 */
	Button start = new Button();
	static Stage myStage = new Stage();
	GameSceneFX gameScene = new GameSceneFX();
	HomeScreenGraphic hsg = new HomeScreenGraphic();
	static CoinItem coin = new CoinItem();
	java.awt.Graphics g;
	public static void main(String[] args) {
		launch (args);

	}
	public void start(Stage primaryStage) throws Exception {
		myStage = primaryStage;
		
		hsg.getHomeText();
		hsg.getHomeTF();
		hsg.getStart();

		
		start = hsg.getStart();
		start.setOnAction(this::startGame);
		
		Group myGroup = hsg.getGroup();// Testing to make sure HomeScreen works
		Scene myScene = new Scene(myGroup, 750, 500, Color.BLACK);
		myStage.setTitle("Math");
		myStage.setScene(myScene);
		myStage.show();
		

	}
	public void startGame(ActionEvent args) {//Starts game-ish
		//coin.makeCoin(g); coin breaks program
		String name = new String();
		name = hsg.getPlayerName();
		gameScene.getText(name);
		gameScene.getGroup();
		myStage.setScene(gameScene.getScene());
	}
}
