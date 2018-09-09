package com.springdemo01;

/**
 * Created by 林力克 on 2018/9/9.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save 运行了");

    }

    @Override
    public void update() {
        System.out.println("update is running");
    }

    @Override
    public void delete() {
        System.out.println("delete is running");
    }
}
