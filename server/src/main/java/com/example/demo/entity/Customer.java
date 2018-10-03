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
@Table(name="Customer")
public class Customer{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long Customer_id;
    private @NonNull String Customer_fname;
    private @NonNull String Customer_lname;
    private @NonNull String Customer_sex;
    private String Customer_address;
    private @NonNull String Customer_province;
    private @NonNull String Customer_email;
    private @NonNull Long Customer_tel;
 
    @OneToMany( mappedBy = "customer", 
                fetch= FetchType.LAZY) 
    private List<Report> Report = new ArrayList<>();

    protected Customer(){}
    public Customer(Long Customer_id,String Customer_fname,String Customer_lname,
    String Customer_sex,String Customer_address,
    String Customer_province,String Customer_email,Long Customer_tel){
        this.Customer_id = Customer_id;
        this.Customer_fname = Customer_fname;
        this.Customer_lname = Customer_lname;
        this.Customer_sex = Customer_sex;
        this.Customer_address = Customer_address;
        this.Customer_province = Customer_province;
        this.Customer_email = Customer_email;
        this.Customer_tel = Customer_tel;

    }
}