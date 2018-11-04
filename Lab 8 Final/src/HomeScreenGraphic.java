import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
/*
 * Raleigh Dial
 * Trevor Henry
 * 10/29
 */
public class HomeScreenGraphic {
	Button start = new Button("Start");
	TextField homeTF = new TextField("Enter Name");
	Text homeText = new Text("GAME!");
	String playerName;
	Group root;
	Text hs=new Text();
	public Group getGroup() {
		root = new Group(start,homeTF,homeText,hs);
		return root;
	}
	//Getters
	public Button getStart() {
		start.setLayoutX(250);
		start.setLayoutY(350);
		return start;
	}
	public TextField getHomeTF() {
		homeTF.setLayoutX(250);
		homeTF.setLayoutY(300);
		return homeTF;
	}
	public Text getHomeText() {
		homeText.setLayoutX(350);
		homeText.setLayoutY(200);
		homeText.setStroke(Color.WHITE);
		return homeText;
	}
	public String getPlayerName() {
		playerName = homeTF.getText();
		return playerName;
	}
	public Text HighScore(String str) {
		hs.setText(str);
		hs.setLayoutX(250);
		hs.setLayoutY(100);
		hs.setStroke(Color.WHITE);
		return hs;
	}
}
