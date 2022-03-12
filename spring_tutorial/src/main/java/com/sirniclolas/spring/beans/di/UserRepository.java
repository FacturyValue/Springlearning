package com.sirniclolas.spring.beans.di;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepository<User> {
    @Override
    public void save(){
        System.out.println("UserRepository save()执行了。。。。。。。。。。。。");
    }
}
