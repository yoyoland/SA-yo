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
@Table(name="Status")
public class Status{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private @NonNull Long Status_id;
    private @NonNull String Status_name;


    @OneToMany( mappedBy = "status",
            fetch= FetchType.LAZY)
    private List<Report> report = new ArrayList<>();

    protected Status(){}
    public Status(Long id,String status_name){
        this.Status_id = id;
        this.Status_name = status_name;
        
    }
}