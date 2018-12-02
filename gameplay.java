package ap_project;

import java.io.FileNotFoundException;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class gameplay extends ap_project{
	public StackPane root = new StackPane();
	//public Scene scene2 = new Scene(root,700,800,Color.BLACK);
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		String style = "-fx-background-color: rgba(0, 0, 0, 0);";
		root.setStyle(style);
		Button btn2= new Button();
		btn2.setText("EXIT GAME");
		btn2.setMaxWidth(Double.MAX_VALUE/2);
		btn2.setStyle("-fx-background-color: #00ff00;-fx-border-color: #ff0000; -fx-border-width: 5px;-fx-font-size: 2em;-fx-text-fill: #0000ff");
		btn2.setTranslateX(0);
		btn2.setTranslateY(-374);
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("START NEW GAME");
				ap_project object = new ap_project();
				try {
					object.start(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
       
        
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(3000),
				(evt) -> {
					try {
						blocks obj2 = new blocks(root);
						ball obj3 = new ball(root);
						magnet obj4 = new magnet(root);
						destroybricks obj5= new destroybricks(root);
						shield obj6= new shield(root);
						wall obj7=new wall(root);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		 root.getChildren().add(btn2);
		Scene scene2 = new Scene(root,700,800,Color.BLACK);
		snake obj1 = new snake(root, scene2);
		final Text text5 = new Text("SCORE : 00");
		text5.setTranslateX(0);
		text5.setTranslateY(-300);
	    text5.setFill(Color.BROWN);
	    text5.setFont(Font.font(java.awt.Font.SERIF, FontWeight.EXTRA_BOLD, 25));
	    root.getChildren().add(text5);
		primaryStage.setTitle("GAME");
        primaryStage.setScene(scene2);
        primaryStage.show();
	}

	 public static void main(String[] args) {
	        launch(args);
	    }

	

}
