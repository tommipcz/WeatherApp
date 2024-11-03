package org.example;

import org.example.daos.GenericDao;

public class GenericService<T, T1 extends Number> {
    public GenericService(GenericDao<T, T1> locationDao) {
    }

    public void save(T prague) {
    }
}
