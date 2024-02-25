package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls,Integer>{

}
