/**
 * 
 */
package com.example.JpaManytomany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaManytomany.entity.Courses;
import com.example.JpaManytomany.entity.Students;
import com.example.JpaManytomany.repo.CourseRepository;
import com.example.JpaManytomany.repo.Studentrepository;


/**
 * @author Administrator
 *
 */

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	@Autowired
	private Studentrepository studentrepository;
	@Autowired
	private CourseRepository courserepository;
	@PostMapping("/add")
	public Students saveStudentWithCourse(@RequestBody Students students) {
		return studentrepository.save(students);
	}
	@GetMapping("/find")
	public List<Students> findAllStudents(){
		return studentrepository.findAll();
	}
	@GetMapping("/{studentid}")
	public Students findStudent(@PathVariable Long studentid) {
		return studentrepository.findById(studentid).orElse(null);
	}
	@GetMapping("/find/{name}")
	public List<Students> findStudentByName(@PathVariable String name){
		return studentrepository.findByNameContaining(name);
	}
//	@GetMapping("/search/{price}")
//	public List<Courses> findcourselessthanprice(@PathVariable double price) {
//		return courserepository.findlessthanprice(price);
//	}

}
