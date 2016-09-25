/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.service;
import com.hasan.derskayit.entity.FacultyMemberLectures;
import com.hasan.derskayit.framework.BaseDAO;
import com.hasan.derskayit.framework.IDataService;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class FacultyMemberLecturesService implements IDataService<FacultyMemberLectures> {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public FacultyMemberLectures save(FacultyMemberLectures entity) {
        baseDAO.save(entity);
        return entity;
    }

    @Override
    public FacultyMemberLectures update(FacultyMemberLectures entity) {
        baseDAO.update(entity);
        return entity;
    }

    @Override
    public boolean delete(FacultyMemberLectures entity) {
        baseDAO.delete(entity);
        return true;
    }

    @Override
    public List<FacultyMemberLectures> getAll() {
       return   (List<FacultyMemberLectures>)(Object) baseDAO.getAll(FacultyMemberLectures.class);
    }

    @Override
    public FacultyMemberLectures getById(Long entityId) {
        return (FacultyMemberLectures) baseDAO.getById(entityId, FacultyMemberLectures.class);
    }

}
