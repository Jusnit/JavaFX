package resources;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

public class Controller_Chart implements Initializable{
	@FXML
	private TabPane tp;
	@FXML 
	private GridPane grid_pie;
	@FXML
	private PieChart pie1, pie2;
	@FXML
	private BarChart bar1, bar2;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initialize_chart();
		
	}
	private void initialize_chart(){
		pie1.setData(getData());
		pie2.setData(getData());
		setLabel(pie1);
		setLabel(pie2);
	}
	
	/*
	 * This is dummy method.
	 * It must be implemented depending on real situation.
	 * **/
	private ObservableList getData(){
		ObservableList list = FXCollections.observableArrayList();
		list.addAll(new PieChart.Data("Students", 43.0), new PieChart.Data("Worker", 26.0), new PieChart.Data("Doctor", 31.0));
		return list;
	}
	
	private void setLabel(PieChart pie){
		final Label label = new Label("");
		label.setTextFill(Color.BLACK);
		label.setStyle("-fx-font: 24 arial;");

		for (final PieChart.Data data : pie.getData()) {
		    data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
		        new EventHandler<MouseEvent>() {
		            @Override public void handle(MouseEvent e) {
		            	 Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
		                label.setTranslateX(e.getScreenX() - visualBounds.getWidth()*0.1);
		                label.setTranslateY(e.getScreenY() - visualBounds.getHeight()*0.3);
		                label.setText(String.valueOf(data.getPieValue()) + "%");
		                grid_pie.getChildren().add(label);
		             }
		        });
		}
	}
	
}
