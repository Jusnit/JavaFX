package resources;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller_DataTable implements Initializable{
	@FXML
	private TableView datatable;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		TableColumn firstNameCol = new TableColumn("First Name");
		TableColumn lastNameCol = new TableColumn("Last Name");
		TableColumn emailCol = new TableColumn("email");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("Email"));
		ObservableList<Person> list = FXCollections.observableArrayList(new Person("Justin", "Wang", "jusnit@gmail.com"),
				new Person("Annie", "Sun", "sun@gmail.com"), new Person("Jack", "Chen", "jack123@gmail.com"));
		datatable.setItems(list);
		datatable.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
		
	}
	
}
