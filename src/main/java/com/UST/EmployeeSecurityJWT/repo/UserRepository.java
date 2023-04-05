package com.UST.EmployeeSecurityJWT.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.EmployeeSecurityJWT.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
