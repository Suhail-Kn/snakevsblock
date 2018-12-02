package ap_project;

import java.util.ArrayList;
import java.util.Random;

import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class wall extends gameplay{
	Rectangle cir1;
	ArrayList<Rectangle> wall;
	
	public wall(StackPane root) {
		wall=new ArrayList<Rectangle>();
		Rectangle cir= new Rectangle();
		// TODO Auto-generated constructor stub
		ParallelTransition trans = new ParallelTransition();
		StackPane root1= new StackPane();
		for(int j=0; j<1;j++) {
			Random rand= new Random();
			int x=rand.nextInt(2)+3;
			ArrayList<Integer> arr= new ArrayList<Integer>();
			ArrayList<Integer> hai= new ArrayList<Integer>();
			for(int i=0; i<x; i++)  {
				int a=rand.nextInt(10);
				while(hai.contains(a)) {
					a=rand.nextInt(10);
					}
				hai.add(a);
				if(arr.contains(a)) {
				}
				else {
					if(a<5) {
						arr.add(a*70-315);
					}
					else {
						arr.add(a*70-315);
					}
				}
			}
			//System.out.println(arr);
			for(int i=0; i<10; i++) {
				int loc=i*70-315;
				if(arr.contains(loc)) {
					
				}
				else {
					//cir[i]=new Rectangle(400,0,70,70);
					int h=rand.nextInt(100)+80;
					cir=new Rectangle(5,h);
					cir.setTranslateX(loc);
					cir.setTranslateY(-920);
					int dd=rand.nextInt(4);
					if(dd==0) {
						cir.setFill(Color.RED);
					}
					else if(dd==1) {
						cir.setFill(Color.GREENYELLOW);
					}
					else if(dd==2) {
						cir.setFill(Color.GHOSTWHITE);
					}
					else if(dd==3) {
						cir.setFill(Color.GOLD);
					}
					
					cir.setArcHeight(50);
					cir.setArcHeight(20);
					cir.setArcWidth(20);
					wall.add(cir);
					TranslateTransition transition= new TranslateTransition();
					transition.setDuration(Duration.seconds(9.1));
					//transition.setToX(0);
					transition.setToY(650);
					transition.setNode(cir);
					
					trans.getChildren().addAll(transition);
					root1.getChildren().addAll(cir);
				}
			}
			root.getChildren().addAll(root1);
		}
		trans.play();
	}
}
