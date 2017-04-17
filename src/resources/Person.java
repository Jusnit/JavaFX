package resources;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	private final SimpleStringProperty firstName;
	private final SimpleStringProperty lastName;
	private final SimpleStringProperty email;
	
	public Person(String firstname, String lastname, String email){
		this.firstName = new SimpleStringProperty(firstname);
		this.lastName = new SimpleStringProperty(lastname);
		this.email = new SimpleStringProperty(email);
	}
	
	public String getFirstName(){
		return this.firstName.get();
	}
	
	public void setFirstName(String fname){
		this.firstName.set(fname);
	}
	
	public String getLastName(){
		return this.lastName.get();
	}
	
	public void setLastName(String lname){
		this.lastName.set(lname);
	}
	
	public String getEmail(){
		return this.email.get();
	}
	
	public void setEmail(String email){
		this.email.set(email);
	}
	
}
