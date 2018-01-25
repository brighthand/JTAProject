package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	
	private static SessionFactory mysession;
	
	private ConnectionUtil() {
	}
	
	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSession() {
		if (mysession ==null) {
			mysession = ConnectionUtil.buildSessionFactory();
		}
		return mysession;
	}

}
