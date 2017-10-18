/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.httpclient;

import br.com.bibliapp.entity.Author;

/**
 *
 * @author LimaD01
 */
public class AuthorClientRest extends GenericClientRest<Author>{

    @Override
    protected String getUrl() {
        return "authors";
    }

    @Override
    protected Class<Author> getClassEntity() {
        return Author.class;
    }
    
}
