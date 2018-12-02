package ap_project;

import java.util.ArrayList;
import java.util.Random;

//import ap_project.snake.Sprite;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class ball extends gameplay {
	ArrayList<Circle> ci;
	ArrayList<Integer> bval;
	
	public ball(Pane root) {
		ci = new ArrayList<Circle>();
		bval= new ArrayList<Integer>();
		Circle cir = new Circle();
		ParallelTransition trans = new ParallelTransition();
		for(int j=0; j<1;j++) {
			Random rand= new Random();
			int x=rand.nextInt(350);
			int a= rand.nextInt(350);
			x = x-a;
			cir=new Circle(10, Color.CYAN);
			cir.setTranslateX(x);
			cir.setTranslateY(-880);
			TranslateTransition transition= new TranslateTransition();
			transition.setDuration(Duration.seconds(7.2));
//			transition.setToX(0);
			transition.setToY(490);
			transition.setNode(cir);
			
			int val2 = rand.nextInt(10)+1;
			bval.add(val2);
			String vall=Integer.toString(val2);
			Text text = new Text(vall);
			text.setTranslateX(x);
			text.setTranslateY(-880);
			TranslateTransition transition1= new TranslateTransition();
			transition1.setDuration(Duration.seconds(7.2));
			//transition.setToX(0);
			transition1.setToY(490);
			transition1.setNode(text);
			
			trans.getChildren().addAll(transition, transition1);
			root.getChildren().addAll(cir, text);
			ci.add(cir);
			
		}
		trans.play();
	}
}
