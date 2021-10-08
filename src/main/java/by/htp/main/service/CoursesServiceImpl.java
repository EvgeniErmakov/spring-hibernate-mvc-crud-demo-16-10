package by.htp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.htp.main.dao.CoursesDAO;
import by.htp.main.entity.Instructor;

@Service
public class CoursesServiceImpl implements CoursesService {
	@Autowired
	private CoursesDAO instructorDAO;
	
	@Transactional
	public List<Instructor> getInstructors() {
		return instructorDAO.getInstructors();
	}
}






