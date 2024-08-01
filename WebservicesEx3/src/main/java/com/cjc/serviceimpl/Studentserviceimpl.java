package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.Studentrepositoryi;
import com.cjc.servicei.Studentservicei;
@Service
public class Studentserviceimpl implements Studentservicei {
	@Autowired
	Studentrepositoryi sri;

	@Override
	public List<Student> preLogin() {
		
		return sri.findAll();
	}

	@Override
	public Student saveData(Student s) {
		
		return sri.save(s);
	}

	@Override
	public List<Student> delete(int rollno) {
		
		sri.deleteData(rollno);
		return sri.findAll();
	}


}
