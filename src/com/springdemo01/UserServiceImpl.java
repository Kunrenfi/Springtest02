package com.springdemo01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by 林力克 on 2018/9/8.
 */
@Component(value = "UserService")
public class UserServiceImpl implements UserService{

    private  String name;
    private int age;
    @Override
    public void save(){
        System.out.println("成功了！");
    }
}
