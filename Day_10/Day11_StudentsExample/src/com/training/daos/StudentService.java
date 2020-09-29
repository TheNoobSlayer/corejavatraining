package com.training.daos;

import java.util.ArrayList;

import com.training.entity.Student;

public class StudentService {
	ArrayList<Student> studentList;

	public StudentService() {
		super();
		studentList=new ArrayList<>();
		addStudent();
		// TODO Auto-generated constructor stub
	}
	
	public void addStudent() {
		int[] ramMarks= {30,40,50,60};
		Student ram=new Student(101, "Ram", "B.E", "IT", 2020, ramMarks);
		int[] shamMarks= {31,41,51,61};
		Student sham=new Student(102, "Sham", "B.E", "IT", 2020, shamMarks);
		int[] gopalMarks= {32,42,52,62};
		Student gopal=new Student(103, "Gopal", "B.E", "IT", 2020, gopalMarks);
		studentList.add(ram);
		studentList.add(sham);
		studentList.add(gopal);
		
		
	}
	public ArrayList<Student> getStudents(){
		
		return studentList;	
	}
	public int[] getMarks(String name) {
		int[] marks=new int[4];
		for(Student eachStudent:studentList) {
			if(eachStudent.getStudentName().equalsIgnoreCase(name)) {
				marks=eachStudent.getMarks();
			}
		}
		return marks;
		
	}
}
