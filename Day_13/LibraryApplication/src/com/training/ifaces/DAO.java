package com.training.ifaces;

import java.sql.SQLException;
import java.util.ArrayList;

import com.training.entity.Member;

public interface DAO<T> {
	public boolean add(T t) throws SQLException;
	public T findById(long id) throws SQLException;
	public ArrayList<T> findAll() throws SQLException;
	public boolean update(T t)throws SQLException;
	public T delete(long id) throws SQLException;
}
