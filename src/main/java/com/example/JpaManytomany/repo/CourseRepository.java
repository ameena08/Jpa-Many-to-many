/**
 * 
 */
package com.example.JpaManytomany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.JpaManytomany.entity.Courses;

/**
 * @author Administrator
 *
 */


public interface CourseRepository extends JpaRepository<Courses,Long>{

	
	
//	List<Courses> findlessthanprice(double price);

	
	

}
