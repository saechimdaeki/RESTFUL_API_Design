package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.LmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Autowired
    private LmsService lmsService;


    @GetMapping("findallbook")
    public Collection<Book> getAllBooks(){
        return lmsService.findAllBooks();
    }

}
