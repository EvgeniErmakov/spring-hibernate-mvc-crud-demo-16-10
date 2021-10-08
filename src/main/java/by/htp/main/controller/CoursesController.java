package by.htp.main.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import by.htp.main.entity.Instructor;
import by.htp.main.service.CoursesService;

@Controller
@RequestMapping("/courses")
public class CoursesController {
	@Autowired
	private CoursesService customerService;
	@Transactional
	@RequestMapping("/list")
	public   String listCustomers(Model theModel, HttpSession session) {
		List<Instructor> theInstructors = customerService.getInstructors();
		Instructor instructor = new Instructor();
		session.setAttribute("instructors",  theInstructors);
		theModel.addAttribute("instructors",  theInstructors);
		theModel.addAttribute("instructor", instructor);
		return "list-customers";}

	//@Transactional
	@GetMapping("/showCourses")
	public String showFormForAdd(@RequestParam("instructorId") int theId,
			HttpSession session) {
		List<Instructor> theInstructors = (List<Instructor>) session.getAttribute("instructors");
		System.out.println(theInstructors.get(0).getEmail());
		System.out.println(theInstructors.get(0).getCourses());
		System.out.println(theId + " - !!!!!!!!!!!!!!!!!!!!!");
		return "list-courses";}}










