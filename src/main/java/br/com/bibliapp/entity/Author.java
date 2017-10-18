/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 * @author LimaD01
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Author implements BaseEntity {

    private Integer id;

    @NotNull(message = "Informe o Primeiro Nome")
    private String firstName;

    @NotNull(message = "Informe o Último Nome")
    private String lastName;

    @Override
    public String getEntityId() {
        return id.toString();
    }

}
