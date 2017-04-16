package resources;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

public class Controller_Main implements Initializable{
	@FXML
	private Button btn1, btn2, btn3;
	@FXML
	private AnchorPane main_content;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btn1.setOnMouseClicked(new EventHandler(){
			@Override
			public void handle(Event arg0) {
				FXMLLoader loader2 = getLoader("/application/btn1_subpage.fxml");
				AnchorPane ap = null;
				try{
					ap = (AnchorPane)loader2.load();
				}catch(Exception e){System.out.println(e.getMessage()+",Holy") ;}
				setMainContent(main_content, ap);
			}
			
		});
		btn2.setOnMouseClicked(new EventHandler(){
			@Override
			public void handle(Event arg0) {
				FXMLLoader loader = getLoader("/application/piechart.fxml");
				TabPane gp_chart = null;
				try{
					gp_chart = loader.load();
				}catch(Exception e){System.out.println(e.getMessage());}
				setMainContent(main_content, gp_chart);
			}
			
		});
		btn3.setOnMouseClicked(new EventHandler(){

			@Override
			public void handle(Event arg0) {
				FXMLLoader loader =getLoader("");
			}
			
		});
	}
	
	private FXMLLoader getLoader(String URL){
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource(URL));
		return loader;
	}
	
	//Set main pane to user switch
	private void setMainContent(AnchorPane mainap, Region node){
		node.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		mainap.getChildren().clear();
		mainap.setLeftAnchor(node, 0d);
		mainap.setTopAnchor(node, 0d);
		mainap.setRightAnchor(node, 0d);
		mainap.setBottomAnchor(node, 0d);
		mainap.getChildren().add(node);
	}
		
	
	
}
