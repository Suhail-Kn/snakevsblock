package ap_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class shield extends gameplay{
	ArrayList<ImageView> shi;
	public shield(Pane root) throws FileNotFoundException {
		shi= new ArrayList<ImageView>();
		Random rand= new Random();
		int y= rand.nextInt(2);
		if(y==0) {
			
		}
		else {
		Image image = new Image(new FileInputStream("C:\\Users\\User\\shield1.jpg"));
		ImageView iv = new ImageView();
	    iv.setImage(image);
	    iv.setFitHeight(50);
	    iv.setFitWidth(50);
		int x=rand.nextInt(350);
		int a= rand.nextInt(350);
		x = x-a;
	    iv.setTranslateX(x);
	    iv.setTranslateY(-800);
	    TranslateTransition transition= new TranslateTransition();
		transition.setDuration(Duration.seconds(6.9));
		//transition.setToX(0);
		transition.setToY(550);
		transition.setNode(iv);
		transition.play();
	    root.getChildren().addAll(iv);
	    shi.add(iv);
		}
}
}
