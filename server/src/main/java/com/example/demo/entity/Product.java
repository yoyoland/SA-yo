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
@Table(name="Product")
public class Product{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long Product_id;
    private @NonNull String Product_name;
    private Long Product_num;
    private double price;
    private String img_url;

    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name = "Product_Report",
    joinColumns = {
        @JoinColumn(name = "Product", referencedColumnName = "Product_id")},
    inverseJoinColumns = {
        @JoinColumn(name = "report", referencedColumnName = "Report_id")})
    private List<Report> abc= new ArrayList<>();

    protected Product(){}
    public Product(Long Product_id,String Product_name,Long Product_num,double price,String img_url){
        this.Product_id = Product_id;
        this.Product_name = Product_name;
        this.Product_num = Product_num;
        this.price = price;
        this.img_url = img_url;
    }
}