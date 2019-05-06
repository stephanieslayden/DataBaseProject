package springbootdemo1.dao;

import org.springframework.data.repository.CrudRepository;

import springbootdemo1.model.TestTask;

public interface TestTaskRepository extends CrudRepository<TestTask, Integer> {

}
