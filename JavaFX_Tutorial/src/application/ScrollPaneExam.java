package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ScrollPaneExam extends Application {

	@Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1200, 1200);
        stage.setScene(scene);

        Rectangle rect = new Rectangle(1000, 1000, Color.RED);
        ScrollPane s1 = new ScrollPane();
        s1.setPannable(true);
        s1.setPrefSize(500, 800);
        s1.setContent(rect);
        s1.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        s1.setHbarPolicy(ScrollBarPolicy.NEVER);
        s1.setPrefHeight(100);
        root.getChildren().add(s1);
        stage.show();
    }
	
	 public static void main(String[] args) {
	        launch(args);
	    }

}
