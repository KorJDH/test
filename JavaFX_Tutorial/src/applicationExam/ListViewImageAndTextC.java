package applicationExam;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import client.MyUser;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

public class ListViewImageAndTextC implements Initializable {

	@FXML
	private ListView<ObjFlag> list;
	private final ObservableList<ObjFlag> data = FXCollections.observableArrayList();
	private Map<String, ObjFlag> userMap = new HashMap<String,ObjFlag>();
	
	private  void addItem(String id, String p ) {
		ObjFlag ob = new ObjFlag(id, p);
		data.add(ob);
		userMap.put(ob.getLi().toString(), ob);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		addItem("France", "user.ico");
		addItem("Korea", "user.png");
		addItem("gimott", "image1.jpg");
		
		if (data.contains(new ObjFlag("gimott", "image1.jpg")) ) {
			
		}else {
			addItem("sdfsdf", "image1.jpg");
		}
		
		list.setCellFactory(new Callback<ListView<ObjFlag>,ListCell<ObjFlag>>(){

			@Override
			public ListCell<ObjFlag> call(ListView<ObjFlag> param) {
				ListCell<ObjFlag> cell = new ListCell<ObjFlag>() {
					protected void updateItem(ObjFlag pays, boolean btl) {
						super.updateItem(pays,btl);
						if(pays!=null) {
							Image img = new Image(getClass().getResource( pays.getFlag()).toExternalForm());
							ImageView imgView = new ImageView(img);
							setGraphic(imgView);
							setText(pays.getLi());
						} else {
							setGraphic(null);
							setText(null);
						}
					}
				};
				return cell;
			}
			
			
		});
		list.setItems(data);
//		data.get(0).setLi("치판러마");
//		list.setItems(data);
		System.out.println("tq");
		
	}
	
    @FXML
    void mouseClicked(MouseEvent click) {
    	System.out.println("??");
    	System.out.println(Integer.toString(list.getSelectionModel().getSelectedIndex()));
    	if(click.getClickCount() == 2 ) {
    		
    		new Thread(() -> {
  		      Platform.runLater(() -> {
    		
		    		ObservableList<ObjFlag> UID;
		    		UID = list.getSelectionModel().getSelectedItems();
		    		String str_Temp = "";
		    		
		    		System.out.println( "Obs size : " + Integer.toString( data.size()));
					System.out.println( "Map size : " + Integer.toString( userMap.size()));
					System.out.println( "List size : " + Integer.toString( list.getItems().size()));
					
					for (ObjFlag id : UID) {
		//				UID.size()
						str_Temp = id.getLi();
						System.out.println(str_Temp);
						/*
						if (data.contains(userMap.get(str_Temp))) {
							System.out.println("있다 시발");
							data.remove( userMap.get(str_Temp));
							userMap.remove(str_Temp);
						}
						*/
						break;
					}
					
					//1. 로그아웃할 ID가 들어온다. str_Temp
					//2. Obs에서 삭제. 
					data.remove(userMap.get(str_Temp));
					userMap.remove(str_Temp);
					//list.getItems().remove(list.getItems().size() -1 );
					//list.getItems().last
		//			list.getItems().clear();
					//list.setItems(data);
//					list.refresh();
					
					
					
					System.out.println( "Obs size : " + Integer.toString( data.size()));
					System.out.println( "Map size : " + Integer.toString( userMap.size()));
					System.out.println( "List size : " + Integer.toString( list.getItems().size()));
			
  		    });   
    		}).start();
			
    		
//			userMap.get("기모찌").
			
			
//			createChatController(str_Temp);
			
//			System.out.println("UID : " + str_Temp);
		}

    }


}
