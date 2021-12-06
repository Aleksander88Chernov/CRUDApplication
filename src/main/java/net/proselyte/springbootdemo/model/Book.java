package net.proselyte.springbootdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "library")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="publisher")
    private String publisher;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name="type")
    private String type;

    @Column(name="release_date")
    private String release_date;
}
