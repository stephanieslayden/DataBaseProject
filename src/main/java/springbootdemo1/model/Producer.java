package springbootdemo1.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="producer")
public class Producer implements Serializable{

	@Id
	private String producer_id;
	
	public Producer() {}
	
	public Producer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private String firstName;
	private String lastName;

	public String getProducer_id() {
		return producer_id;
	}

	public void setProducer_id(String producer_id) {
		this.producer_id = producer_id;
	}

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

	@Override
	public String toString() {
		return "Producer [producer_id=" + producer_id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
