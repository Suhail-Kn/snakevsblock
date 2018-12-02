package ap_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class snake extends gameplay {
	Sprite player;
	ArrayList<Sprite> spr;
    //Pane root = new Pane();


	public snake(StackPane root, Scene scene2) {
		// TODO Auto-generated constructor stub
		spr=new ArrayList<Sprite>();
	    for(int i=0; i<4; i++) {
	    	int x=60+i*20;
	    	player = new Sprite(0,x,10,40, "player", Color.CYAN );
	    	spr.add(player);
	    }
	    for(int i=0; i<spr.size();i++ ) {
	    	root.getChildren().add(spr.get(i));
	    }
 	    scene2.setOnKeyPressed(e -> {
          switch (e.getCode()) {
              case A:
                  for(int i=0; i<spr.size();i++) {
                	  spr.get(i).moveLeft();
                  }
                  break;
              case D:
                  for(int i=0; i<spr.size();i++) {
                	  spr.get(i).moveRight();
                  }
                  break;
              case SPACE:
                  //shoot(player);
                  break;
          }
      });
	}

    public static class Sprite extends Circle {
        boolean dead = false;
        final String type;

        Sprite(int x, int y, int w, int h, String type, Color color) {
            super(w, color);

            this.type = type;
            setTranslateX(x);
            setTranslateY(y);
        }

        void moveLeft() {
            setTranslateX(getTranslateX() - 5);
        }

        void moveRight() {
            setTranslateX(getTranslateX() + 5);
        }

        void moveUp() {
            setTranslateY(getTranslateY() - 5);
        }

        void moveDown() {
            setTranslateY(getTranslateY() + 5);
        }
    }
}
