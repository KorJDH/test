package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LabelInPaneExam extends Application {

	@Override
    public void start(Stage stage) {
		
		StackPane stack = new StackPane();
		Pane pane = new Pane();
		Label label = new Label("¾Ó ±â¸ðÂî");
		
		pane.getChildren().add(label);
		stack.getChildren().add(pane);
		pane.setStyle("-fx-background-color: #39A67F");
		label.setFont(Font.font("Verdana",FontWeight.BOLD,  22));
		label.setTextFill(Color.WHITE);
		
		Scene scene = new Scene(stack,800,800);
		stage.setScene(scene);
        stage.show();
    }
	public static void main(String args[]) {
		launch(args);
	}

}
