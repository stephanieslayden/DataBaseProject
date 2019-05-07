package springbootdemo1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import springbootdemo1.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, String>{
	
	@Query("SELECT new springbootdemo1.model.ProducerMovie(m.title, p.firstName) FROM movie m, producer p WHERE m.producer_id = p.producer_id AND m.year_released > 2000")
	public List<Object[]> findAllMovies();
	
}
