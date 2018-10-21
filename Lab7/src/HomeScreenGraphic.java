import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
/*
 * Raleigh Dial
 * 10/19
 */
public class HomeScreenGraphic {
	Button start = new Button("Start");
	TextField homeTF = new TextField("Enter Name");
	Text homeText = new Text("GAME!");
	String playerName;
	Group root;
	public Group getGroup() {
		root = new Group(start,homeTF,homeText);
		return root;
	}
	//Getters
	public Button getStart() {
		start.setLayoutX(250);
		start.setLayoutY(400);
		return start;
	}
	public TextField getHomeTF() {
		homeTF.setLayoutX(250);
		homeTF.setLayoutY(350);
		return homeTF;
	}
	public Text getHomeText() {
		homeText.setLayoutX(250);
		homeText.setLayoutY(250);
		return homeText;
	}
	public String getPlayerName() {
		playerName = homeTF.getText();
		return playerName;
	}
}
