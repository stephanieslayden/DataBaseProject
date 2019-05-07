package springbootdemo1.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="genre")
public class Genre {

	@Id
	private String movie_id;
	
	public Genre() {}
	
	public Genre(String genre_name) {
		super();
		this.genre_name = genre_name;
	}
	
	private String genre_name;
	@ManyToMany
	Set<Movie> genreMovie;

	public Set<Movie> getGenreMovie() {
		return genreMovie;
	}

	public void setGenreMovie(Set<Movie> genreMovie) {
		this.genreMovie = genreMovie;
	}

	public String getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

	@Override
	public String toString() {
		return "Genre [movie_id=" + movie_id + ", genre_name=" + genre_name + ", genreMovie=" + genreMovie + "]";
	}
	
	
}
