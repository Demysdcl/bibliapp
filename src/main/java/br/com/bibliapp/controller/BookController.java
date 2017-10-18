/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.controller;

import br.com.bibliapp.entity.Book;
import br.com.bibliapp.service.BookService;
import javax.faces.bean.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author LimaD01
 */
@ViewScoped
@Getter
@Setter
@ELBeanName(value = "bookController")
@Join(path = "/book", to = "/jsf/book-view.jsf")
@Component(value = "bookController")
public class BookController extends GenericController<Book> {
    
    @Autowired
    private BookService service;

    @Override
    public void prepareToSave() {
        setEntity(new Book());
    }
    
    
    
}
