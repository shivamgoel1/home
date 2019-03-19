package com.cts.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.Doctor;
import com.cts.entity.Services;

@Repository("customerdao")
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Services> serviceList() {
		// TODO Auto-generated method stub
		
		Session session= sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Services> query= builder.createQuery(Services.class);
		Root<Services> root = query.from(Services.class);
		query.select(root);
		Query query2= session.createQuery(query);
		return query2.getResultList();
	}

	@Override
	public List<Doctor> doctorList() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Doctor> query= builder.createQuery(Doctor.class);
		Root<Doctor> root = query.from(Doctor.class);
		query.select(root);
		Query query2= session.createQuery(query);
		return query2.getResultList();
	}

}
