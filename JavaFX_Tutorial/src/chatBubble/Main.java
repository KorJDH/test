package chatBubble;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {
		
		ConversationView conver = new ConversationView("에바에연");
		StackPane stack = new StackPane();
		stack.getChildren().add( conver);
		stage.setScene(new Scene(stack,800,400));
//		stage.resizableProperty().setValue(Boolean.FALSE);
		
		stage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
