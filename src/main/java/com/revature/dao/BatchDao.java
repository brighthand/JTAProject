package com.revature.dao;

import java.util.List;
import com.revature.model.Batch;

public interface BatchDao {
	
	public Batch findById(int id);
	public Batch findByName(String name);
	public List<Batch> getAllBatches();

}
