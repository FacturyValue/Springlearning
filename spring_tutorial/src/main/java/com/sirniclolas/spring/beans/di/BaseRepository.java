package com.sirniclolas.spring.beans.di;

public class BaseRepository<T> {
    public BaseRepository(){
        System.out.println("BaseRepository NoArgsConstructor Execute().............");
    }
    public void save(){
        System.out.println("BaseRepository save()..........");
    }
}
