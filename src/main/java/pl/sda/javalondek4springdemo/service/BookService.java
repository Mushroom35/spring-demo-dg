package pl.sda.javalondek4springdemo.service;

import org.springframework.stereotype.Service;
import pl.sda.javalondek4springdemo.model.Book;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    public List<Book> findAllBooks() {
        //check null :)
        return Collections.emptyList();
    }
}
