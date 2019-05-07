package springbootdemo1.model;

import java.io.Serializable;

public class ProducerMovie implements Serializable{
	
	private String title;
	private Integer year_released;
	private Integer rating;
	private Integer price;
	private String firstName;
	private String lastName;
	
	public ProducerMovie() {}

	public ProducerMovie(String title, String firstName) {
		super();
		this.title = title;
//		this.year_released = year_released;
//		this.rating = rating;
//		this.price = price;
		this.firstName = firstName;
		//this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear_released() {
		return year_released;
	}

	public void setYear_released(Integer year_released) {
		this.year_released = year_released;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
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
		return "ProducerMovie [title=" + title + ", year_released=" + year_released + ", rating=" + rating + ", price="
				+ price + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
