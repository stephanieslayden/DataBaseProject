package springbootdemo1.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import springbootdemo1.dao.MovieRepository;
import springbootdemo1.model.Movie;

@Service
@Transactional
public class MovieService {

	private final MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public List<Object[]> findAll() {
		List<Object[]> movie = movieRepository.findAllMovies();
		return movie;
	}
	
//	public Movie findMovie(String movie_id) {
//		return MovieRepository.findOne(movie_id);
//	}
	
//	public void save(Movie movie) {
//		MovieRepository.save(movie);
//	}
	
//	public void delete(String movie_id) {
//		MovieRepository.delete(movie_id);
//	}
	
}
