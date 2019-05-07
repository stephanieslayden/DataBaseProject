package springbootdemo1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="movie")
public class Movie implements Serializable{
	
	@Id
	private String movie_id;
	
	public Movie() {}
	
	public Movie(String producer_id, String title, Integer year_released, Integer rating, Integer price) {
		super();
		this.producer_id = producer_id;
		this.title = title;
		this.year_released = year_released;
		this.rating = rating;
		this.price = price;
	}
	
	private String producer_id;
	private String title;
	private Integer year_released;
	private Integer rating;
	private Integer price;

	public String getMovie_id() {
		return movie_id;
	}
	
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	
	public String getProducer_id() {
		return producer_id;
	}
	
	public void setProducer_id(String producer_id) {
		this.producer_id = producer_id;
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

	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", producer_id=" + producer_id + ", title=" + title + ", year_released="
				+ year_released + ", rating=" + rating + ", price=" + price + "]";
	}
	

}
