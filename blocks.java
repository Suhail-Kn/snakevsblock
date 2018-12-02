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

public class blocks extends gameplay{
	ArrayList<Rectangle> rec;
	ArrayList<Integer> value;
	public blocks(StackPane root) throws InterruptedException {
		rec=new ArrayList<Rectangle>();
		value= new ArrayList<Integer>();
		Rectangle cir= new Rectangle();
		// TODO Auto-generated constructor stub
		ParallelTransition trans = new ParallelTransition();
		StackPane root1= new StackPane();
		for(int j=0; j<1;j++) {
			Random rand= new Random();
			int x=rand.nextInt(6)+4;
			System.out.println(x);
			int y=10-x;
			ArrayList<Integer> arr= new ArrayList<Integer>();
			ArrayList<Integer> hai= new ArrayList<Integer>();
			for(int i=0; i<y; i++)  {
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
			System.out.println(arr);
			for(int i=0; i<10; i++) {
				int loc=i*70-315;
				if(arr.contains(loc)) {
					
				}
				else {
					//cir[i]=new Rectangle(400,0,70,70);
					cir=new Rectangle(70,70);
					cir.setTranslateX(loc);
					cir.setTranslateY(-470);
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
					rec.add(cir);
					int val = rand.nextInt(20);
					value.add(val);
					String vall=Integer.toString(val);
					Text text = new Text(vall);
					text.setTranslateX(loc);
					text.setTranslateY(-470);
					TranslateTransition transition= new TranslateTransition();
					transition.setDuration(Duration.seconds(5.9));
					//transition.setToX(0);
					transition.setToY(550);
					transition.setNode(cir);
					
					TranslateTransition transition1= new TranslateTransition();
					transition1.setDuration(Duration.seconds(5.9));
					//transition.setToX(0);
					transition1.setToY(550);
					transition1.setNode(text);
					
					trans.getChildren().addAll(transition, transition1);
					root1.getChildren().addAll(cir,text);
					root1.setAlignment(Pos.CENTER);
				}
			}
			root.getChildren().addAll(root1);
		}
		trans.play();
	}
}
