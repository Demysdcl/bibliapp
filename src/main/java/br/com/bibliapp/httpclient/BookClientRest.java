/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.httpclient;

import br.com.bibliapp.entity.Book;

/**
 *
 * @author LimaD01
 */
public class BookClientRest extends GenericClientRest<Book>{

    @Override
    protected Class<Book> getClassEntity() {
        return Book.class;
    }

    @Override
    protected String getUrl() {
        return "books";
    }    
}
