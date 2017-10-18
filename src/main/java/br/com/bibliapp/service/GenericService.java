/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.service;

import br.com.bibliapp.httpclient.GenericClientRest;
import java.util.List;

/**
 *
 * @author LimaD01
 */
public interface GenericService<T> {

    List<T> getAll();

    T find(String id);

    void save(T entity);

    void update(String id, T entity);

    void delete(String id);

}
