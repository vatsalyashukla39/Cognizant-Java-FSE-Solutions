package org.example.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public List<String> findAll()
    {
        List<String> books = new ArrayList<>();
        books.add("The Kite Runner");
        books.add("Think Again");
        books.add("Code of Extraordinary Mind");
        return books;
    }
}
