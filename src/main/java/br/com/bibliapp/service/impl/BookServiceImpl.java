/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.service.impl;

import br.com.bibliapp.entity.Book;
import br.com.bibliapp.httpclient.BookClientRest;
import br.com.bibliapp.httpclient.GenericClientRest;
import br.com.bibliapp.service.AuthorService;
import br.com.bibliapp.service.BookService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LimaD01
 */
@Service("bookService")
public class BookServiceImpl extends GenericServiceImpl<Book> implements BookService{

    @Autowired
    AuthorService service;
    
    @Override
    protected GenericClientRest getClientRest() {
        return new BookClientRest();
    }    

    @Override
    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        List<LinkedHashMap> all = (List<LinkedHashMap>) getClientRest().getAll();
        all.forEach(map -> {
            Book book = new Book();
            Integer idAuthor = Integer.parseInt(map.get("authorId").toString());
            Integer id = Integer.parseInt(map.get("id").toString());
            book.setAuthorId(idAuthor);
            book.setId(id);
            book.setTitle(map.get("title").toString());
            book.setAuthor(service.find(id.toString()));
            books.add(book);
        });
        return books;
    }
}
