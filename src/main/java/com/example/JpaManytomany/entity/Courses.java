/**
 * 
 */
package com.example.JpaManytomany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



/**
 * @author Administrator
 *
 */

@Entity
@Table(name="COURSE_TBL")
public class Courses {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String abbreviation;
	private int modules;
	private double fee;

	

	@ManyToMany(mappedBy="courses",fetch=FetchType.LAZY)
	@JsonManagedReference
	private Set<Students> students;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAbbreviation() {
		return abbreviation;
	}



	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}



	public int getModules() {
		return modules;
	}



	public void setModules(int modules) {
		this.modules = modules;
	}



	public double getFee() {
		return fee;
	}



	public void setFee(double fee) {
		this.fee = fee;
	}



	public Set<Students> getStudents() {
		return students;
	}



	public void setStudents(Set<Students> students) {
		this.students = students;
	}



	public Courses(Long id, String title, String abbreviation, int modules, double fee, Set<Students> students) {
	
		this.id = id;
		this.title = title;
		this.abbreviation = abbreviation;
		this.modules = modules;
		this.fee = fee;
		this.students = students;
	}
	

}
