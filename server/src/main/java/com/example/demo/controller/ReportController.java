/*
package com.example.demo.controller;

import java.util.Collection;

import com.example.demo.entity.Report;
import com.example.demo.repository.ReportRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController{
    private ReportRepository repo;

    public ReportController(ReportRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Report")
    public Collection<Report> report(){
        return repo.findAll();
    }
}
*/