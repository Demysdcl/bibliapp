/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.controller;

import javax.faces.bean.ViewScoped;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LimaD01
 */
//@ViewScoped
@Component(value = "productController")
@ELBeanName(value = "productController")
@RestController
public class HomeController {
    
    @GetMapping(path = "/")
    public String sayHello(){
        return "Hello JSF and Spring Boot";
    }
    
}
