package net.proselyte.springbootdemo.repository;

import net.proselyte.springbootdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

       @Query( "SELECT b FROM Book b WHERE b.author LIKE ?1%"
                + "OR b.publisher LIKE ?1%"
                + "OR b.release_date LIKE ?1%"
                + "OR b.title LIKE ?1%"
                + "OR b.type LIKE ?1%")
         List<Book> listAll(String keyword) ;





    }

