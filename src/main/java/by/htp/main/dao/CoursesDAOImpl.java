





package by.htp.main.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import by.htp.main.entity.Instructor;

@Repository
public class CoursesDAOImpl implements CoursesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public List<Instructor> getInstructors() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Instructor> theQuery = 
				currentSession.createQuery("from Instructor order by lastName",
						Instructor.class);
		List<Instructor> instructors = theQuery.getResultList();
		return instructors;}}











