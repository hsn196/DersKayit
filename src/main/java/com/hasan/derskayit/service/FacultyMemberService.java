/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.service;
import com.hasan.derskayit.entity.FacultyMember;
import com.hasan.derskayit.framework.BaseDAO;
import com.hasan.derskayit.framework.IDataService;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class FacultyMemberService implements IDataService<FacultyMember> {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public FacultyMember save(FacultyMember entity) {
        baseDAO.save(entity);
        return entity;
    }

    @Override
    public FacultyMember update(FacultyMember entity) {
        baseDAO.update(entity);
        return entity;
    }

    @Override
    public boolean delete(FacultyMember entity) {
        baseDAO.delete(entity);
        return true;
    }

    @Override
    public List<FacultyMember> getAll() {
        return   (List<FacultyMember>)(Object)baseDAO.getAll(FacultyMember.class);
    }

    @Override
    public FacultyMember getById(Long entityId) {
        return (FacultyMember) baseDAO.getById(entityId, FacultyMember.class);
    }

}
