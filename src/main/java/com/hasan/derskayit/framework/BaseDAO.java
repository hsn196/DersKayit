/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.framework;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Hasan
 */
public class BaseDAO {

    private Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }

    public Object save(Object entity) {
        Session session = getSession();
        Transaction trans = session.getTransaction();
        trans.begin();
        session.save(entity);
        trans.commit();
        return entity;
    }

    public Object update(Object entity) {
        Session session = getSession();
        Transaction trans = session.getTransaction();
        trans.begin();
        session.update(entity);
        trans.commit();
        return entity;
    }

    public boolean delete(Object entity) {
        Session session = getSession();
        Transaction trans = session.getTransaction();
        trans.begin();
        session.delete(entity);
        trans.commit();
        return true;
    }

    public List<Object> getAll(Class cls) {
        Session session = getSession();
        Criteria cr = session.createCriteria(cls);
        return cr.list();
    }

    public Object getById(Long entityId, Class cls) {
        Session session = getSession();
        Criteria cr = session.createCriteria(cls);
        cr.add(Restrictions.eq("id", entityId));
        return cr.uniqueResult();
    }
}
