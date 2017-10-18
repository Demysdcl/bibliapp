/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 *
 * @author LimaD01
 */
@Data
public class Book implements BaseEntity {

    private Integer id;
    private String title;
    private Integer authorId;

    @JsonIgnore
    private Author author;

    @Override
    public String getEntityId() {
        return id.toString();
    }

}
