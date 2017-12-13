package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import layoutsample.graphics.LayoutSample;


public class Main extends Application {
	int num = 0;
	public void start(Stage stage) {
		try {
			// stage > scene > container > node
			
			//container
			//Pane  pane = new Pane();	//container 중 하나
			StackPane stackPan = new StackPane();
			stackPan.setStyle("-fx-background-color:Yellow;");
			Scene scene = new Scene(stackPan,800,500);
			
			//node
			Label label = new Label();
			label.setText("Hello World");
			label.setStyle("-fx-font-size: 30; -fx-text-fill: red; -fx-background-color: Black;");	//CSS코드 설정
			stackPan.getChildren().add(label);
			stackPan.setAlignment(label,Pos.TOP_CENTER);
			
			Button btn1 = new Button();
			btn1.setText("버어튼");
			btn1.setStyle("fx-font-size:15;");
			btn1.setOnAction(e->{
				num++;
				btn1.setText("버어튼" + num);				
			});
			
			
			stackPan.getChildren().add(btn1);
			stackPan.setAlignment(btn1, Pos.CENTER);
			
			Button btn2 = new Button();
			btn2.setText("버어튼zzzzzzzzzzzzz");
			btn2.setStyle("fx-font-size:15;");
			stackPan.getChildren().add(btn2);
			stackPan.setAlignment(btn2, Pos.CENTER_RIGHT);
			
			
			
			
			
			

			
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			stage.setScene(scene);
			stage.setResizable(true);
			stage.setTitle("JavaFX Example");
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void gogo() {
		
	}
	
	public GridPane addGridPane() {
	    GridPane grid = new GridPane();
	    grid.setHgap(10);
	    grid.setVgap(10);
	    grid.setPadding(new Insets(0, 10, 0, 10));

	    // Category in column 2, row 1
	    Text category = new Text("Sales:");
	    category.setFont(Font.font("Arial", FontWeight.BOLD, 20));
	    grid.add(category, 1, 0); 

	    // Title in column 3, row 1
	    Text chartTitle = new Text("Current Year");
	    chartTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
	    grid.add(chartTitle, 2, 0);

	    // Subtitle in columns 2-3, row 2
	    Text chartSubtitle = new Text("Goods and Services");
	    grid.add(chartSubtitle, 1, 1, 2, 1);

	    // House icon in column 1, rows 1-2
	    ImageView imageHouse = new ImageView(
	      new Image(LayoutSample.class.getResourceAsStream("graphics/house.png")));
	    grid.add(imageHouse, 0, 0, 1, 2); 

	    // Left label in column 1 (bottom), row 3
	    Text goodsPercent = new Text("Goods\n80%");
	    GridPane.setValignment(goodsPercent, VPos.BOTTOM);
	    grid.add(goodsPercent, 0, 2); 

	    // Chart in columns 2-3, row 3
	    ImageView imageChart = new ImageView(
	     new Image(LayoutSample.class.getResourceAsStream("graphics/piechart.png")));
	    grid.add(imageChart, 1, 2, 2, 1); 

	    // Right label in column 4 (top), row 3
	    Text servicesPercent = new Text("Services\n20%");
	    GridPane.setValignment(servicesPercent, VPos.TOP);
	    grid.add(servicesPercent, 3, 2);

	    return grid;
	}
	
	
}
