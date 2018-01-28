package com.revature.main;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.revature.model.Batch;

public class BatchTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	AnnotationConfiguration config = new AnnotationConfiguration();
	config.addAnnotatedClass(Batch.class);
	config.configure("hibernate.cfg.xml");
	
	new SchemaExport(config).create(true, true);

	
	
	}

}
