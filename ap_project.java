package ap_project;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ap_project extends Application{
	Scene scene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text("Snake VS Block");
		text.setFill(Color.BLUE);
		text.setFont(Font.font(java.awt.Font.SERIF, FontWeight.EXTRA_BOLD, 45));
		text.setTranslateX(0);
		text.setTranslateY(-350);
		Button btn1= new Button();
		btn1.setText("START NEW GAME");
		btn1.setMaxSize(400, 50);
		btn1.setTranslateY(-250);
		btn1.setTranslateX(0);
		btn1.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");

		Button btn2= new Button();
		btn2.setText("RESUME GAME");
		btn2.setMaxSize(400, 50);
		btn2.setTranslateY(-125);
		btn2.setTranslateX(0);
		btn2.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");

		Button btn3= new Button();
		btn3.setText("LEADER BOARD");
		btn3.setMaxSize(400, 50);
		btn3.setTranslateY(0);
		btn3.setTranslateX(0);
		btn3.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");

		Button btn4= new Button();
		btn4.setText("HELP");
		btn4.setMaxSize(400, 50);
		btn4.setTranslateY(125);
		btn4.setTranslateX(0);
		btn4.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");

		Button btn5= new Button();
		btn5.setText("EXIT");
		btn5.setMaxSize(400, 50);
		btn5.setTranslateY(250);
		btn5.setTranslateX(0);
		btn5.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");
		Image image = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\game.png"));
		ImageView iv = new ImageView();
	    iv.setImage(image);
	    iv.setFitHeight(900);
	    iv.setFitWidth(800);
	    iv.setTranslateX(0);
	    iv.setTranslateY(-150);
	    
		int size1=700;
		int size2=800;
		StackPane root = new StackPane();
		String style = "-fx-background-color: rgba(0, 0, 0, 0);";
		root.setStyle(style);
		root.getChildren().addAll(iv, text, btn1, btn2, btn3, btn4, btn5);
		Scene scene = new Scene(root, size1, size2, Color.BLACK);
		scene.setFill(Color.BLACK);
		
		//Image image = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\game.png"));
		
		primaryStage.setTitle("SNAKE VS BLOCK GAME");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				gameplay obj = new gameplay();
				try {
					obj.start(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("RESUME GAME");
				Button btn1= new Button();
				btn1.setText("BACK");
				btn1.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");
				primaryStage.setTitle("RESUME GAME");
				final Group rootGroup = new Group();
				final Scene scene2 = new Scene(rootGroup, 700, 800, Color.BLACK);
				final Text text5 = new Text(230, 100, "SORRY, NO SAVED GAME");
			      text5.setFill(Color.RED);
			      text5.setFont(Font.font(java.awt.Font.SERIF, FontWeight.EXTRA_BOLD, 25));
			      final Light.Distant light = new Light.Distant();
			      light.setAzimuth(-135.0);
			      final Lighting lighting = new Lighting();
			      lighting.setLight(light);
			      lighting.setSurfaceScale(9.0);
			      rootGroup.getChildren().add(text5);
			  rootGroup.getChildren().add(btn1);
			    
			    primaryStage.setScene(scene2);
			    primaryStage.show();
			    btn1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("START NEW GAME");
						primaryStage.setScene(scene);
					}
				});
		
			}
		});
		btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("TOP 10 SCORES");
				Button btn1= new Button();
				btn1.setText("BACK");
				btn1.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");
				primaryStage.setTitle("LEADERBOARD");
				final Group rootGroup = new Group();
				final Scene scene2 = new Scene(rootGroup, 700, 800, Color.BLACK);
				final Text text5 = new Text(230, 100, "TOP 10 HIGH SCORES :"
						+ " suhail khan 200");
			      text5.setFill(Color.RED);
			      text5.setFont(Font.font(java.awt.Font.SERIF, FontWeight.EXTRA_BOLD, 25));
			      final Light.Distant light = new Light.Distant();
			      light.setAzimuth(-135.0);
			      final Lighting lighting = new Lighting();
			      lighting.setLight(light);
			      lighting.setSurfaceScale(9.0);
			      rootGroup.getChildren().add(text5);
			  rootGroup.getChildren().add(btn1);
			    
			    primaryStage.setScene(scene2);
			    primaryStage.show();
			    btn1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("START NEW GAME");
						primaryStage.setScene(scene);
					}
				});
		
			}
		});
		btn4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("INSTRUCTIONS");
				Button btn1= new Button();
				btn1.setText("BACK");
				btn1.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");
				primaryStage.setTitle("GAME RULES");
				final Group rootGroup = new Group();
				final Scene scene2 = new Scene(rootGroup, 700, 800, Color.BLACK);
				final Text text5 = new Text(15, 100, "1) The snake is a collection of n balls arranged linearly. (n >= 0)\r\n" + 
						"2) Snake can move in 3 directions: forward, left, and right.\r\n" + 
						"3) The snake always moves forward until it encounters a block.\r\n" + 
						"4) Blocks and Walls appear randomly during the gameplay.\r\n" + 
						"5) Each block has a value, which represents the points made by the player when the snake\r\n" + 
						"eats it. After eating the block the length of the snake decreases by the value of the block\r\n" + 
						"6) Blocks may occur independently, or in a chain. Atleast one of the block in a chain should\r\n" + 
						"have a value less than the length of the snake.\r\n" + 
						"7) Walls may occur in different lengths, but should not divide the screen in two halves at\r\n" + 
						"any time. That is, length of the wall should be strictly less than the length of screen.\r\n" + 
						"8) Snake should not be able to move across the wall.\r\n" + 
						"9) A snake may encounter 4 types of tokens during the gameplay.\r\n" + 
						"a) Ball: A ball has a value written over it. The length of the snake increases by the\r\n" + 
						"value of the ball if it eats the ball.\r\n" + 
						"b) Destroy Blocks: Destroy all the blocks present on the screen. Value of each block\r\n" + 
						"destroyed is added to the score of the player.\r\n" + 
						"c) Shield: A shield lets the player eat any block without decreasing the snake's\r\n" + 
						"length. Again, the value of the block eaten by snake is added to the total score of\r\n" + 
						"the player. The shield remains with snake for 5 seconds only.\r\n" + 
						"d) Magnet: A magnet allows the snake to collect coins which are within a certain\r\n" + 
						"distance from the head of the snake. The distance should be chosen by the\r\n" + 
						"programmer but should not equal the width of the screen.\r\n" + 
						"10) The frequency of ball is greater than the frequency of other 3 tokens.\r\n" + 
						"11) Speed of snake in forward direction increases as its length increases\r\n" + 
						"12) The game ends when the snake is not able to eat a block completely");
			      text5.setFill(Color.RED);
			      text5.setFont(Font.font(java.awt.Font.SERIF, FontWeight.EXTRA_BOLD, 17));
			      final Light.Distant light = new Light.Distant();
			      light.setAzimuth(-135.0);
			      final Lighting lighting = new Lighting();
			      lighting.setLight(light);
			      lighting.setSurfaceScale(9.0);
			      rootGroup.getChildren().add(text5);
			  rootGroup.getChildren().add(btn1);
			    
			    primaryStage.setScene(scene2);
			    primaryStage.show();
			    btn1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("START NEW GAME");
						primaryStage.setScene(scene);
					}
				});
		
			}
		});
		btn5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Button btn1= new Button();
				btn1.setText("YES, I WANNA EXIT...");
				btn1.setMaxWidth(Double.MAX_VALUE);
				btn1.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");

				Button btn2= new Button();
				btn2.setText("NO, I WANNA PLAY AGAIN!");
				btn2.setMaxWidth(Double.MAX_VALUE);
				btn2.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");
				VBox root = new VBox(50);
			
				String style = "-fx-background-color: rgba(0, 0, 0, 0);";
				root.setStyle(style);
				root.setPadding(new Insets(100));
				root.getChildren().addAll(btn1, btn2);
				final Scene scene1 = new Scene(root, 800, 400, Color.BLACK);
				scene1.setFill(Color.BLACK);
				
				primaryStage.setTitle("DO YOU WANT TO EXIT?");
				primaryStage.setScene(scene1);
				primaryStage.show();
				
				btn1.setOnAction(e -> System.exit(0));
				
				btn2.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("START NEW GAME");
						primaryStage.setScene(scene);
					}
				});
				
			}
		});
		//btn5.setOnAction(e -> System.exit(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}	

}