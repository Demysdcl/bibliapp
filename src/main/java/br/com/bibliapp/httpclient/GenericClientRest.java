/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.httpclient;

import java.net.URI;
import java.util.List;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author LimaD01
 */
public abstract class GenericClientRest<T> {
    
    protected abstract String getUrl();
    
    protected abstract Class<T> getClassEntity();
    
    private static final String REST_SERVICE_URL = "https://bibliapp.herokuapp.com/api/";
    
    private final String fullUrl = REST_SERVICE_URL + getUrl();
    
    RestTemplate restTemplate = new RestTemplate();
    
    public void save(T entity) {
        restTemplate.postForLocation(fullUrl, entity);
    }
    
    public List<?> getAll(){
        return restTemplate.getForObject(fullUrl, List.class);
    }
    
    public T find(String id){
        return restTemplate.getForObject(fullUrl + "/" + id, getClassEntity());
    }
    
    public void update(String id, T entity ){
        restTemplate.put(fullUrl + "/" + id, entity);
    }
    
    public void delete(String id){
        restTemplate.delete(fullUrl + "/" + id);
    }
    
}
