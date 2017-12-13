package svgPath;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;

public class SVGpathExam extends Application {

	@Override
    public void start(Stage stage) {
		
		StackPane stack = new StackPane();
		VBox mainBox  = new VBox(5);
		
		//사각형 그리기
		SVGPath Rect= new SVGPath();
		Rect.setContent("M0 0 L200 0 L200 200 L0 200 Z");
		Rect.setFill(Color.GREEN);
		
		//삼각형 그리기
		SVGPath Tri= new SVGPath();
		Tri.setContent("M100 0 L200 200 L0 200 Z");
		Tri.setFill(Color.RED);
		
		SVGPath Tri2= new SVGPath();
		Tri2.setContent("M100 0 L0 100 L0 0 Z");
		Tri2.setFill(Color.YELLOW);
		
		Label lab = new Label("                   ");
		Background back = new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(5,0,5,5,false), Insets.EMPTY));
		lab.setBackground(back);
	
		
		20171211-0000461
		
		mainBox.getChildren().addAll(Rect, Tri,Tri2, lab);
		stack.getChildren().add(mainBox);
		Scene scene = new Scene(stack,800,800);
		stage.setTitle("SVGPath 예제");
		stage.setScene(scene);
        stage.show();
    }
	public static void main(String args[]) {
		launch(args);
	}
}
