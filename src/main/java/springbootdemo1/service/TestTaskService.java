package springbootdemo1.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import springbootdemo1.dao.TestTaskRepository;
import springbootdemo1.model.TestTask;

@Service
@Transactional
public class TestTaskService {

	private final TestTaskRepository testTaskRepository;

	public TestTaskService(TestTaskRepository testTaskRepository) {
		this.testTaskRepository = testTaskRepository;
	}
	
	public List<TestTask> findAll() {
		List<TestTask> testTasks = new ArrayList<>();
		for (TestTask testTask : testTaskRepository.findAll()) {
			testTasks.add(testTask);
		}
		return testTasks;
	}
	
	public TestTask findTestTask(int id) {
		return testTaskRepository.findOne(id);
	}
	
	public void save(TestTask testTask) {
		testTaskRepository.save(testTask);
	}
	
	public void delete(int id) {
		testTaskRepository.delete(id);
	}
	
	
	
	
	
}
