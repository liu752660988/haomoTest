package com.jege.spring.boot.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.jege.spring.boot.data.jpa.entity.User;


public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

  List<User> findByNameLike(String name);

}
