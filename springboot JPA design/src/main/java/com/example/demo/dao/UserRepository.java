package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
     List<User> findByJob(String job);

     long countByAge(int age);

     List<User> deleteByName(String name);

     List<User> findByCareer(int career);

     //multi
     List<User> findByJobAndAge(String job,int age);

     //ignore
     List<User> findByJobIgnoreCase(String job);


    @Query("select u from User u")
    List<User> getUserQuery();
}
