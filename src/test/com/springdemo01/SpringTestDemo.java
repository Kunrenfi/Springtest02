package com.springdemo01;

import org.junit.Test;
import com.springdemo01.UserDao;

/**
 * Created by 林力克 on 2018/9/9.
 */
public class SpringTestDemo {
    @Test
    public void demo01(){
        System.out.print("XXXXXXXXXXXX");
    }


    @Test
    public void demo02(){
    UserDao userDao = new UserDaoImpl();
   //jdk的动态代理实现
    UserDao proxy = new JDKProxy(userDao).createProxy();

    proxy.save();
    userDao.update();
    userDao.delete();
    }
}
