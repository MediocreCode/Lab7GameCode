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
		return start;
	}
	public TextField getHomeTF() {
		return homeTF;
	}
	public Text getHomeText() {
		return homeText;
	}
	public String getPlayerName() {
		playerName = homeTF.getText();
		return playerName;
	}
}
