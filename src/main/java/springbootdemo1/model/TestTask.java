package springbootdemo1.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="test_tasks")
public class TestTask implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public TestTask(String firstName, String lastName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public TestTask(){}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "TestTask [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
