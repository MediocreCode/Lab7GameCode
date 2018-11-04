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
 * 11/2
 * 
 */
	Button start = new Button();
	static Stage myStage = new Stage();
	GameSceneFX gameScene = new GameSceneFX();
	HomeScreenGraphic hsg = new HomeScreenGraphic();
	static SheepItem shep1 = new SheepItem();
//	static SheepItem shep2 = new SheepItem();
//	static SheepItem shep3 = new SheepItem();
//	static SheepItem shep4 = new SheepItem();
//	static SheepItem shep5 = new SheepItem();
	Player p1 = new Player();
	Enemy bad = new Enemy();
	java.awt.Graphics g;
	Scene gameSceneScene;
	static String name = new String();
	static String hs = new String();
	int i = 0;
	public static void main(String[] args) {
		launch (args);

	}
	public void start(Stage primaryStage) throws Exception {
		//this.myStage = primaryStage;
		
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
//		shep2.genCoinX();
//		shep2.genCoinY();
//		shep2.makeShep();
//		shep3.genCoinX();
//		shep3.genCoinY();
//		shep3.makeShep();
//		shep4.genCoinX();
//		shep4.genCoinY();
//		shep4.makeShep();
//		shep5.genCoinX();
//		shep5.genCoinY();
//		shep5.makeShep();
		gameScene.getGroup(p1.getPlayerImg(),shep1.getShep(),bad.getEn());
		gameSceneScene = gameScene.getScene();
		gameSceneScene.setOnKeyPressed(this::keyMove);
		myStage.setScene(gameSceneScene);
		}
	public void keyMove(KeyEvent event) {
		KeyCode myCode = event.getCode();
		//Movement
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
		//Bounds
		if(p1.getX2()>750) {
			p1.moveLeft();
		}
		if(p1.getX1()<0) {
			p1.moveRight();
		}
		if(p1.getY2()>500) {
			p1.moveUp();
		}
		if(p1.getY1()<0) {
			p1.moveDown();
		}
		//Collision
		if(areRectsColliding(p1.getX1(), p1.getX2(), p1.getY1(), p1.getY2(), shep1.getCoinX(), shep1.getW(), shep1.getCoinY(), shep1.getH())) {
			i++;
			gameScene.changeCounter(name,i);
			shep1.genCoinX();
			shep1.genCoinY();
			shep1.makeShep();		
		}
		if(p1.getX1()>bad.getX1()&&p1.getX2()>bad.getX2()) {
			bad.moveRight();
		}
		if(p1.getX1()<bad.getX1()&&p1.getX2()<bad.getX2()) {
			bad.moveLeft();
		}
		if(p1.getY1()<bad.getY1()&&p1.getY2()<bad.getY2()) {
			bad.moveUp();
		}
		if(p1.getY1()>bad.getY1()&&p1.getY2()>bad.getY2()) {
			bad.moveDown();
		}
		if(areRectsColliding(p1.getX1(), p1.getX2(), p1.getY1(), p1.getY2(), bad.getX1(), bad.getX2(), bad.getY1(), bad.getY2())) {
			hs = gameScene.getHS();
			i=0;
			hsg.HighScore(hs);
			p1.setX1(0);
			p1.setX2(20);
			p1.setY1(0);
			p1.setY2(32);
			bad.setX1(600);
			bad.setX2(632);
			bad.setY1(400);
			bad.setY2(420);
			Group myGroup = hsg.getGroup();
			Scene myScene = new Scene(myGroup, 750, 500, Color.BLACK);
			myStage.setScene(myScene);		
		}
		
//		if(areRectsColliding(p1.getX1(), p1.getX2(), p1.getY1(), p1.getY2(), shep2.getCoinX(), shep2.getW(), shep2.getCoinY(), shep2.getH())) {
//			i++;
//			gameScene.changeCounter(name,i);
//			shep2.genCoinX();
//			shep2.genCoinY();
//			shep2.makeShep();}
	}
	public boolean areRectsColliding(int r1TopLeftX, int
			r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int
			r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int
			r2BottomRightY)
			{
		if (r1TopLeftX < r2BottomRightX && r1BottomRightX >
			r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY >
			r2TopLeftY) {
		return true;
		}
		else{
		return false;
		}
	}
}
