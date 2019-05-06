package springbootdemo1.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springbootdemo1.model.TestTask;
import springbootdemo1.service.TestTaskService;

@Controller

public class MainController {

	@Autowired
	private TestTaskService testTaskService;
	
	@GetMapping("/")
	public String hellopage(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/alltaskslist")
	public String allTestDatas(HttpServletRequest request) {
		request.setAttribute("testTasks", testTaskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "listTasks";
	}
	
	@GetMapping("/newtask")
	public String newTask(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_NEW");
		return "listTasks";
	}
	
	@PostMapping("/savetask")
	public String saveTestTask(@ModelAttribute TestTask testTask, BindingResult result, HttpServletRequest request) {
		testTask.setDateCreated(new Date());
		testTaskService.save(testTask);
		request.setAttribute("testTasks", testTaskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "listTasks";
	}
	
	@GetMapping("/updatetask")
	public String updateTestTask(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("testTasks", testTaskService.findTestTask(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "listTasks";
	}
	
	@GetMapping("/deletetask")
	public String deleteTestTask(@RequestParam int id, HttpServletRequest request) {
		testTaskService.delete(id);
		request.setAttribute("testTasks", testTaskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "listTasks";
	}
	
	
	
	
	
	
}
