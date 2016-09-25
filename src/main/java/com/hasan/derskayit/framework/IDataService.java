/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hasan.derskayit.framework;

import java.util.List;

/**
 *
 * @author Hasan
 */
public interface IDataService<T> {

    public T save(T entity);

    public T update(T entity);

    public boolean delete(T entity);

    public List<T> getAll();

    public T getById(Long entityId);
}
