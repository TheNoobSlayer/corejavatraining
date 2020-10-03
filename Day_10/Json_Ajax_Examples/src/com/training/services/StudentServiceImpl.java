package com.training.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import com.training.entity.Student;

public class StudentServiceImpl {
	private HashMap<Integer,Student> studentList=null;

	public StudentServiceImpl() {
		super();
		this.studentList=new HashMap();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		this.studentList.put(1, new Student(1, "Ramesh"));
		this.studentList.put(2, new Student(2, "Suresh"));
		this.studentList.put(3, new Student(3, "Magesh"));
	}
	
	public Student findById(int key) {
		init();
		if(this.studentList.get(key)!=null) {
			return this.studentList.get(key);
		}else {
			throw new NoSuchElementException("Student not Found");
		}
	}
	
	public HashMap<Integer,Student> findAll(){
		init();
		
		return this.studentList;
	}
}
