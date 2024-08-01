package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface Studentrepositoryi extends JpaRepository<Student, Integer>{

	
	
	List<Student> findAll();
	
	@Transactional
	@Modifying
	@Query(name="deletedata", value="delete from Student where rollno=?1")

	void deleteData(int rollno);
	
	

}
