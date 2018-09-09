package com.springdemo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 林力克 on 2018/9/9.
 */
public class JDKProxy implements InvocationHandler {
    private  UserDao userDao;
    public JDKProxy(UserDao userDao){
        this.userDao=userDao;
    }
    /*
     产生userDao的代理方法
     */
    public UserDao createProxy(){
     UserDao userDaoProxy=(UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return  userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       //判断方法名称是不是save
        if("save".equals(method.getName())){
            //增强
            System.out.println("进行了权限校验");
            return method.invoke(userDao,args);
        }

        return method.invoke(userDao,args);
    }
}
