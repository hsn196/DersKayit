/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.service;

import com.hasan.derskayit.entity.Lecture;
import com.hasan.derskayit.framework.BaseDAO;
import com.hasan.derskayit.framework.IDataService;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class LectureService implements IDataService<Lecture> {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public Lecture save(Lecture entity) {
        baseDAO.save(entity);
        return entity;
    }

    @Override
    public Lecture update(Lecture entity) {
        baseDAO.update(entity);
        return entity;
    }

    @Override
    public boolean delete(Lecture entity) {
        baseDAO.delete(entity);
        return true;
    }

    @Override
    public List<Lecture> getAll() {
        return (List<Lecture>)(Object) baseDAO.getAll(Lecture.class);
    }

    @Override
    public Lecture getById(Long entityId) {
        return (Lecture) baseDAO.getById(entityId, Lecture.class);
    }

}
