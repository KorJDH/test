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
		
		/** bind() �޼���� �ܹ���. ta1 -> ta2�� �ǰ� , ta2 -> ta1�� �Ұ��� */
		TextArea ta1 = new TextArea("ta1�������� ���� ��� �Ʒ����� �ڵ����� �ۼ��˴ϴ�.");
		TextArea ta2 = new TextArea("ta2");
		Button btn = new Button("click");
		btn.setOnAction((e) -> {
			ta1.setText("����");
		});
		ta2.textProperty().bind(ta1.textProperty());
		//ta2.textProperty().unbind();	//����ε� �� �� ���
		
		/** ����� Binding */
		TextArea ta3 = new TextArea("����� ���ε� �˴ϴ� .");
		TextArea ta4 = new TextArea("ta4");
		Bindings.bindBidirectional(ta3.textProperty(),ta4.textProperty());
		Button btn2 = new Button("click");
		btn2.setOnAction((e) -> {
			ta4.setText("ũ");
		});
		
		box.getChildren().addAll(ta1,ta2,btn,ta3,ta4,btn2);
		
		Scene scene =new Scene(box,800,800);
		stage.setTitle("���ε� ����");
		stage.setScene(scene);
        stage.show();
    }
	public static void main(String args[]) {
		launch(args);
	}
}
