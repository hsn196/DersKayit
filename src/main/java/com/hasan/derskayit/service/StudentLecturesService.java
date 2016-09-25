/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.service;

import com.hasan.derskayit.entity.Student;
import com.hasan.derskayit.entity.StudentLectures;
import com.hasan.derskayit.framework.BaseDAO;
import com.hasan.derskayit.framework.IDataService;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class StudentLecturesService implements IDataService<StudentLectures> {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public StudentLectures save(StudentLectures entity) {
        baseDAO.save(entity);
        return entity;
    }

    @Override
    public StudentLectures update(StudentLectures entity) {
        baseDAO.update(entity);
        return entity;
    }

    @Override
    public boolean delete(StudentLectures entity) {
        baseDAO.delete(entity);
        return true;
    }

    @Override
    public List<StudentLectures> getAll() {
        //return   (List<StudentLectures>) baseDAO.getAll(StudentLectures.class);
        return null;
    }

    @Override
    public StudentLectures getById(Long entityId) {
        return (StudentLectures) baseDAO.getById(entityId, StudentLectures.class);
    }

}
