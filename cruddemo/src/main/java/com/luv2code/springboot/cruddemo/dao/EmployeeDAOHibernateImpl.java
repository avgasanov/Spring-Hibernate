package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {

		Session hibernateSession = entityManager.unwrap(Session.class);
		
		Query<Employee> query = hibernateSession.createQuery("from Employee", Employee.class);
		
		List<Employee> employees = query.getResultList();
		return employees;
		
	}

	@Override
	public Employee findById(int theId) {

		Session hibernateSession = entityManager.unwrap(Session.class);
		
		Employee employee = hibernateSession.get(Employee.class, theId);
		
		return employee;
	}

	@Override
	public void save(Employee theEmployee) {
		Session hibernateSession = entityManager.unwrap(Session.class);
		
		hibernateSession.saveOrUpdate(theEmployee);
		
	}

	@Override
	public void deleteById(int theId) {

		Session hibernateSession = entityManager.unwrap(Session.class);
		
		Query theQuery = 
				hibernateSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();
		
	}

}
