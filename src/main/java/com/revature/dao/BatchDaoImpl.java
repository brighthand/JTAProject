package com.revature.dao;

import org.hibernate.Session;

import com.revature.model.Batch;
import com.revature.util.ConnectionUtil;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.query.Query;

public class BatchDaoImpl implements BatchDao {
	@Override
	public Batch findById(int batchid) {
		Session session = ConnectionUtil.getSession().openSession();
		Batch bat = null;
		try {
			session.beginTransaction();
			bat = (Batch) session.get(Batch.class, batchid);
			return bat;
		} finally {
			session.close();
		}
	}
	
	/*@Override
	public Batch findByName(String name) {
		
		Session session = ConnectionUtil.getSession().openSession();
		Batch bat = null;
		try {
			session.beginTransaction();
			bat = (Batch) session.get(Batch.class, name);
			return bat;
		} finally {
			session.close();
		}
	}  no 'name' field featured in table  */
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Batch> getAllBatches() {
		Session session = ConnectionUtil.getSession().openSession();
		List<Batch> thebatches = null;
		try {
			session.beginTransaction();
			thebatches = session.createQuery("from Batches").list();
			return thebatches;
		} finally {
			session.close();
		}
		
	}
}
