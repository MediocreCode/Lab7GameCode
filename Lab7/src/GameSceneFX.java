import java.awt.Graphics;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class GameSceneFX {
	Text counter = new Text();
	Text pName = new Text();
	Group root = new Group();
	Scene myScene;
	static int i= 0;
	
	public String getName(String name) {
		return name;
	}
	public Text getText(String pName) {
	counter.setText(pName+": "+i);
	counter.setLayoutX(0);
	counter.setLayoutY(20);
	counter.setStroke(Color.WHITE);
	return counter;
}
	public Group getGroup(ImageView p1) {
		root = new Group(counter,p1);
		return root;
	}
	public Scene getScene() {
		myScene = new Scene(root,750, 500, Color.BLACK);
		return myScene;
	}
}