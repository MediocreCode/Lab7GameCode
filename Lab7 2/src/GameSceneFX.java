
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
/*
 * Raleigh
 * 10/29
 */
public class GameSceneFX {
	Text counter = new Text();
	static String pName;
	Group root = new Group();
	Scene myScene;
	int i= 0;
	
	public String getName(String name) {
		return name;
	}
	public Text getText(String pName) {
	//this.pName = pName;
	counter.setText(pName+": "+i);
	counter.setLayoutX(0);
	counter.setLayoutY(20);
	counter.setStroke(Color.WHITE);
	return counter;
}
	public Group getGroup(ImageView p1,ImageView shep1) {
		root = new Group(counter,p1,shep1);
		return root;
	}
	public Scene getScene() {
		myScene = new Scene(root,750, 500, Color.BLACK);
		return myScene;
	}
	public Text changeCounter(String name,int i) {
		counter.setText(name+": "+i++);
		return counter;
	}
}