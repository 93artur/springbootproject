package com.springproject.springbootproject.buyer.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
}
