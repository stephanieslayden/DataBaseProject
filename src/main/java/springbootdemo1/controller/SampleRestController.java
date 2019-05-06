package springbootdemo1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springbootdemo1.model.TestTask;
import springbootdemo1.service.TestTaskService;

@RestController
public class SampleRestController {

	@Autowired
	private TestTaskService testTaskService;
	
	@GetMapping("/test")
	public String hello() {
		return "Hello from controller...";
	}
	/*
	@GetMapping("/all-testtasks")
	public String allTestTasks() {
		return testTaskService.findAll().toString();
	}
	
	@GetMapping("/save-testtask")
	public String saveTestTask(@RequestParam String name, @RequestParam String desc) {
		TestTask testTask = new TestTask(name, desc, new Date(), false);
		testTaskService.save(testTask);
		return "Test Task has been saved!";
	}
	

	@GetMapping("/delete-testtask")
	public String deleteTestTask( @RequestParam int id) {
		testTaskService.delete(id);
		return "Test Task has been deleted!";
	}
	
	
	*/
	
}
