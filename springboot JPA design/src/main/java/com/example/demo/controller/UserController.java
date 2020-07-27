package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/getUsers")
    public List<User> getAllUser(){
        return service.getUser();
    }


    @GetMapping("/getUserByJob/{job}")
    public List<User> getUserByJob(@PathVariable String job){
        return service.getUserByJob(job);
    }

    @GetMapping("/getUserCount/{age}")
    public String getCountByAge(@PathVariable int age){
        long count=service.getCounts(age);
        return "total count"+count;
    }

    @DeleteMapping("/delete/{name}")
    public List<User> deleteUser(@PathVariable String name){
        return service.deleteUser(name);
    }

    @GetMapping("/getUserWithCareer/{career}")
    public List<User> getUserByCareer(@PathVariable int career){
        return service.getCareerUser(career);
    }

    @GetMapping("/findmulti/{job}/{age}")
    public List<User> getUserByJobAndAge(@PathVariable String job,@PathVariable int age){
        return service.findByMultiCondition(job,age);
    }

    @GetMapping("/getuserwithignore")
    public List<User> getUserByIgnore(@RequestParam("job") String job){
        return service.findByIgnoreCondition(job);
    }

    @GetMapping("/getSort/{field}")
    public List<User> getSortedUser(@PathVariable String field){
        return service.getUserSort(field);
    }

    @GetMapping("/getquery")
    public List<User> getUserByQuery(){
        return service.getUsersCustomQuery();
    }
}
