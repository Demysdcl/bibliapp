/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bibliapp.controller;

import br.com.bibliapp.entity.BaseEntity;
import br.com.bibliapp.service.GenericService;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LimaD01
 */
@Getter
@Setter
public abstract class GenericController<T extends BaseEntity> {

    protected abstract GenericService<T> getService();

    public abstract void prepareToSave();

    private List<T> list;

    private T entity;

    @PostConstruct
    private void init() {
        list = getService().getAll();
    }

    public void update() {
        getService().update(entity.getEntityId(), entity);
    }

    public void save() {
        getService().save(entity);
        list.add(entity);
    }

    public void delete() {
        if (entity != null) {
            getService().delete(entity.getEntityId());
            list.remove(entity);
        }
    }

}
