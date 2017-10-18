/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.service.impl;

import br.com.bibliapp.httpclient.GenericClientRest;
import br.com.bibliapp.service.GenericService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LimaD01
 */
public abstract class GenericServiceImpl<T> implements GenericService<T> {

    protected abstract GenericClientRest getClientRest();
    
    @Override
    public T find(String id) {
        return (T)getClientRest().find(id);
    }

    @Override
    public void save(T entity) {
        getClientRest().save(entity);
    }

    @Override
    public void update(String id, T entity) {
        getClientRest().update(id, entity);
    }

    @Override
    public void delete(String id) {
        getClientRest().delete(id);
    }

}
