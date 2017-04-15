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

public class Controller1 implements Initializable{
	@FXML
	private Button btn1, btn2;
	@FXML
	private AnchorPane main_content;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btn1.setOnMouseClicked(new EventHandler(){
			@Override
			public void handle(Event arg0) {
//				FXMLLoader loader= new FXMLLoader();
				FXMLLoader loader2 = new FXMLLoader();
//				loader.setLocation(this.getClass().getResource("/application/grid.fxml"));
				loader2.setLocation(this.getClass().getResource("/application/btn1_subpage.fxml"));
//				BorderPane bp = null;
//				GridPane gp1 = null;
//				GridPane gp2 = null;
				AnchorPane ap = null;
				try{
//					gp1 = (GridPane)loader.load();
//					gp2 = (GridPane)gp1.lookup("#grid_main_page");
//					bp = (BorderPane)gp2.lookup("#main_content");
					ap = (AnchorPane)loader2.load();
//					if(ap == null)System.out.println("ap is null");
//					if(gp1 == null) System.out.println("gp1 is null");
//					if(gp2 == null)System.out.println("gp2 is  null");
				}catch(Exception e){System.out.println(e.getMessage()+",Holy") ;}
//				System.out.println("click");l
//				bp.getChildren().add(new Button("123"));
//				Button  b = new Button("NEW BUTTON");
//				b.setMaxHeight(Double.MAX_VALUE);
//				b.setMaxWidth(Double.MAX_VALUE);
//				b.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//				main_content.add(new Button("123"),1,1);
//				ap.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//				main_content.getChildren().clear();
//				main_content.setLeftAnchor(ap, 0d);
//				main_content.setTopAnchor(ap, 0d);
//				main_content.setRightAnchor(ap, 0d);
//				main_content.setBottomAnchor(ap, 0d);
//				main_content.getChildren().add(ap);
				setMainContent(main_content, ap);
			}
			
		});
		btn2.setOnMouseClicked(new EventHandler(){
			@Override
			public void handle(Event arg0) {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(this.getClass().getResource("/application/piechart.fxml"));
				TabPane gp_chart = null;
				try{
					gp_chart = loader.load();
				}catch(Exception e){System.out.println(e.getMessage());}
				setMainContent(main_content, gp_chart);
			}
			
		});
	}
	
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
