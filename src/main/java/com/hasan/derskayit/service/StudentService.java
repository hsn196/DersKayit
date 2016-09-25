/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.service;

import com.hasan.derskayit.entity.Student;
import com.hasan.derskayit.framework.BaseDAO;
import com.hasan.derskayit.framework.IDataService;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class StudentService implements IDataService<Student> {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public Student save(Student entity) {
        baseDAO.save(entity);
        return entity;
    }

    @Override
    public Student update(Student entity) {
        baseDAO.update(entity);
        return entity;
    }

    @Override
    public boolean delete(Student entity) {
        baseDAO.delete(entity);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return   (List<Student>)(Object)baseDAO.getAll(Student.class);
    }

    @Override
    public Student getById(Long entityId) {
        return (Student) baseDAO.getById(entityId, Student.class);
    }

}
