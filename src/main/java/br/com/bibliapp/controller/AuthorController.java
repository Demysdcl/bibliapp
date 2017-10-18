/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.controller;

import br.com.bibliapp.entity.Author;
import br.com.bibliapp.service.AuthorService;
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
@ELBeanName(value = "authorController")
@Join(path = "/author", to = "/jsf/author-view.jsf")
@Component(value = "authorController")
public class AuthorController extends GenericController<Author> {
    
    @Autowired
    private AuthorService service;
    
    @Override
    public void prepareToSave() {
        setEntity(new Author());
    }
    
}
