/**
 * 
 */
package com.example.JpaManytomany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.JpaManytomany.entity.Students;

/**
 * @author Administrator
 *
 */


public interface Studentrepository extends JpaRepository<Students,Long>{

	List<Students> findByNameContaining(String name);

	
}
