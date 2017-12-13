package bindingExam;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BindingExam extends Application {

	@Override
    public void start(Stage stage) {
		
		VBox box = new VBox();
		
		/** bind() 메서드는 단방향. ta1 -> ta2만 되고 , ta2 -> ta1은 불가능 */
		TextArea ta1 = new TextArea("ta1구역에만 글을 써또 아래까지 자동으로 작성됩니다.");
		TextArea ta2 = new TextArea("ta2");
		Button btn = new Button("click");
		btn.setOnAction((e) -> {
			ta1.setText("기모띠");
		});
		ta2.textProperty().bind(ta1.textProperty());
		//ta2.textProperty().unbind();	//언바인딩 할 때 사용
		
		/** 양방향 Binding */
		TextArea ta3 = new TextArea("양방향 바인딩 됩니다 .");
		TextArea ta4 = new TextArea("ta4");
		Bindings.bindBidirectional(ta3.textProperty(),ta4.textProperty());
		Button btn2 = new Button("click");
		btn2.setOnAction((e) -> {
			ta4.setText("크");
		});
		
		box.getChildren().addAll(ta1,ta2,btn,ta3,ta4,btn2);
		
		Scene scene =new Scene(box,800,800);
		stage.setTitle("바인딩 예제");
		stage.setScene(scene);
        stage.show();
    }
	public static void main(String args[]) {
		launch(args);
	}
}
