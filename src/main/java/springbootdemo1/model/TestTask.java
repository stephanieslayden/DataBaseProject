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
	
	public TestTask(String name, String description, Date dateCreated, boolean finished) {
		super();
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
	}
	private String name;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	private boolean finished;
	
	public TestTask(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	@Override
	public String toString() {
		return "TestTask [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + dateCreated
				+ ", finished=" + finished + "]";
	}
	
	
}
