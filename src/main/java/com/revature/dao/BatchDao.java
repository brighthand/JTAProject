package com.revature.dao;

import java.util.List;
import com.revature.model.Batch;

public interface BatchDao {
	
	public Batch findById(int id);
	//public Batch findByName(String name);  definition commented out in DaoImpl
	public List<Batch> getAllBatches();

}
