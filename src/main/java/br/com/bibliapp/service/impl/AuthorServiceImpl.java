/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.service.impl;

import br.com.bibliapp.entity.Author;
import br.com.bibliapp.httpclient.AuthorClientRest;
import br.com.bibliapp.httpclient.GenericClientRest;
import br.com.bibliapp.service.AuthorService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author LimaD01
 */
@Service("authorService")
public class AuthorServiceImpl extends GenericServiceImpl<Author> implements AuthorService{

    @Override
    protected GenericClientRest getClientRest() {
        return new AuthorClientRest();
    }

    @Override
    public List<Author> getAll() {
        return getClientRest().getAll();
    }
    
    
     
}
