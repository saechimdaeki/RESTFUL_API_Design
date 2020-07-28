package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.LmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class LmsService {

    @Autowired
    private LmsRepository lmsRepository;

    public Collection<Book> findAllBooks(){
        List<Book> books=new ArrayList<>();
        for(Book book:lmsRepository.findAll()){
            books.add(book);
        }
        return books;
    }
}
