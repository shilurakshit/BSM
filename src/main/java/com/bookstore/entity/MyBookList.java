package com.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MyBooks")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyBookList {

    @Id
    private int id;
    private String name;
    private String author;
    private String price;
}