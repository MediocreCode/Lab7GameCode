import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application {
/*
 * Raleigh Dial
 * 10/20
 */
	public static void main(String[] args) {
		launch (args);

	}
	public void start(Stage primaryStage) throws Exception {
		CoinItem c1 = new CoinItem();
		System.out.println(c1.genCoinX()+" "+c1.genCoinY());
		HomeScreenGraphic hsg = new HomeScreenGraphic();
		
		hsg.getHomeText();
		hsg.getHomeTF();
		hsg.getStart();
		Group myGroup = hsg.getGroup();// Testing to make sure HomeScreen works
		Scene myScene = new Scene(myGroup, 750, 500, Color.AQUAMARINE);
		primaryStage.setTitle("Math");
		primaryStage.setScene(myScene);
		primaryStage.show();
		

	}

}
