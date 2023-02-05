package com.greatlearning.cf.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	com.greatlearning.cf.model.User findByEmail(String email);

	com.greatlearning.cf.model.User save(com.greatlearning.cf.model.User user);
}