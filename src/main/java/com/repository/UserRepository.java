package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

//	UserEntity findByName(String fName);
//	
//	List<UserEntity> getAll();
	
}
