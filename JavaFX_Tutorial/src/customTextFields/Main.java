package customTextFields;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application{

	public Main() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox(10);
		root.setPadding(new Insets(50,50,50,50));
		
		Label txt = new Label("Custom TextFields");
		
	}

}
