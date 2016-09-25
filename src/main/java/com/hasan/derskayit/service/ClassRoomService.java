/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.service;

import com.hasan.derskayit.entity.ClassRoom;
import com.hasan.derskayit.framework.BaseDAO;
import com.hasan.derskayit.framework.IDataService;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class ClassRoomService implements IDataService<ClassRoom> {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public ClassRoom save(ClassRoom entity) {
        baseDAO.save(entity);
        return entity;
    }

    @Override
    public ClassRoom update(ClassRoom entity) {
        baseDAO.update(entity);
        return entity;
    }

    @Override
    public boolean delete(ClassRoom entity) {
        baseDAO.delete(entity);
        return true;
    }

    @Override
    public List<ClassRoom> getAll() {
        return (List<ClassRoom>)(Object) baseDAO.getAll(ClassRoom.class);
    }

    @Override
    public ClassRoom getById(Long entityId) {
        return (ClassRoom) baseDAO.getById(entityId, ClassRoom.class);
    }

}
