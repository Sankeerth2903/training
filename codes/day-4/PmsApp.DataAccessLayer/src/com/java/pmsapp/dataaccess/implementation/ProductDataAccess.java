package com.java.pmsapp.dataaccess.implementation;

import com.java.pmsapp.logging.*;
import java.util.List;

import com.java.pmsapp.dataaccess.contracts.*;
import com.java.pmsapp.entities.Product;

public class ProductDataAccess implements DataAccessContract<Product> {

	@Override
	public boolean add(Product product) {
		try {

		} catch (Exception e) {
			// AppLogger logger = new AppLogger();
			AppLogger logger = AppLogger.getLogger();
			logger.LogError("error occurred");
		}
		return false;
	}

	@Override
	public boolean delete(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product get(int productId) {
		// JDBC code
		return null;
	}

	@Override
	public List<Product> getAll() {
		// JDBC code
		return null;
	}

	@Override
	public boolean modify(int productId, Product product) {
		// JDBC code
		return false;
	}
}
