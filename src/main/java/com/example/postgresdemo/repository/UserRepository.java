package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//	List<Question> findByUserId(Long userId);
}
