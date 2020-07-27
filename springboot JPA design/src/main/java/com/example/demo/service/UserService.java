package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void connectDB(){
        List<User> users=new ArrayList<>();
        users.add(new User(1,"kim","student",26,0));
        users.add(new User(2,"JUN","developer",29,3));
        users.add(new User(3,"seong","student",23,0));
        users.add(new User(4,"sung","professeor",40,5));
        users.add(new User(5,"kkiimm","student",30,0));
        repository.saveAll(users);
    }
    public List<User> getUser(){
        return repository.findAll();
    }

    public List<User> getUserByJob(String job){
        return repository.findByJob(job);
    }
    public long getCounts(int age){
        return repository.countByAge(age);
    }

    public List<User> deleteUser(String name){
        return repository.deleteByName(name);
    }
    public List<User> getCareerUser(int career){
        return repository.findByCareer(career);
    }

    public List<User> findByMultiCondition(String job,int age){
        return repository.findByJobAndAge(job,age);
    }

    public List<User> findByIgnoreCondition(String job){
        return repository.findByJobIgnoreCase(job);
    }
    public List<User> getUserSort(String field){
         return repository.findAll(Sort.by(field));
    }
    public List<User> getUsersCustomQuery(){
        return repository.getUserQuery();
    }
}
