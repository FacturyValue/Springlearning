package com.sirniclolas.spring.beans.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    protected  BaseRepository<T> baseRepository;

    public void add(){
        Class<? extends BaseService> clazz = this.getClass();
        System.out.println("BaseService:\t"+clazz);
        System.out.println("add .........");
        System.out.println(baseRepository);
        baseRepository.save();
    }
}
