package com.cjc.servicei;

import java.util.List;

import com.cjc.model.Student;

public interface Studentservicei {

	List<Student> preLogin();

	Student saveData(Student s);

	

}
