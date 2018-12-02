package ap_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class magnet extends gameplay {
	
	ArrayList<ImageView> mag;
	public magnet(Pane root) throws FileNotFoundException {
		mag= new ArrayList<ImageView>();
		Random rand= new Random();
		int y= rand.nextInt(2);
		if(y==0) {
			
		}
		else {
		Image image = new Image(new FileInputStream("C:\\Users\\User\\magnet1.jpg"));
		ImageView iv = new ImageView();
	    iv.setImage(image);
	    iv.setFitHeight(60);
	    iv.setFitWidth(60);
	    int x=rand.nextInt(350);
		int a= rand.nextInt(350);
		x = x-a;
	    iv.setTranslateX(x);
	    iv.setTranslateY(-580);
	    TranslateTransition transition= new TranslateTransition();
		transition.setDuration(Duration.seconds(6.4));
//		transition.setToX(0);
		transition.setToY(550);
		transition.setNode(iv);
		transition.play();
	    root.getChildren().addAll(iv);
	    mag.add(iv);
		}
	}
}
