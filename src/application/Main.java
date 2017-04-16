package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("main_layout.fxml"));
			GridPane root = loader.load();
			Scene scene = new Scene(root, 200, 250);
////			TreeView<String> tview = (TreeView<String>)scene.lookup("#tree");
//			Node icon = new Circle();
//			TreeItem<String> rootItem = new TreeItem("Level1", icon);
//			TreeView<String> tview = new TreeView(rootItem);
//			for(int i = 0 ; i< 5; i++){
//				TreeItem<String> subtree = new TreeItem("level2");
//				rootItem.getChildren().add(subtree);				
//			}
//			root.setLeft(tview);
//			========================================================================
//			ListView lv = (ListView)scene.lookup("#lv");
//			ObservableList name =  FXCollections.observableArrayList();
//			ObservableList data =  FXCollections.observableArrayList();
//	        name.addAll(
//	                "Adam", "Alex", "Alfred", "Albert",
//	                "Brenda", "Connie", "Derek", "Donny", 
//	                "Lynne", "Myrtle", "Rose", "Rudolph", 
//	                "Tony", "Trudy", "Williams", "Zach"
//	           );
//	            
//	           for (int i = 0; i < 18; i++) {
//	               data.add("anonym");
//	           }
//	            
//			lv.setItems(data);
//			lv.setCellFactory(ComboBoxListCell.forListView(name));
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


