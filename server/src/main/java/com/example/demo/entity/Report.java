package com.example.demo.entity;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter @Setter
@Table(name="Report")
public class Report{
     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long Report_id;
    private @NonNull String Report_name;
    private Long Report_num;
    private double Report_price;
    private String Report_status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Customer_id")
    private Customer customer;
    
     @ManyToMany(mappedBy = "abc", fetch = FetchType.LAZY)
    private List<Product> product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Status_id")
    private Status status;

    protected Report(){}
    public Report(Long Report_id,String Report_name,Long Report_num,double Report_price,String Report_status){
        this.Report_id = Report_id;
        this.Report_name = Report_name;
        this.Report_num = Report_num;
        this.Report_price = Report_price;
        this.Report_status = Report_status;
    }
}