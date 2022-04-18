package com.sccs.spring.proxy;

import com.sccs.spring.dao.UserDao;
import com.sccs.spring.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao =
                (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces, new UserDaoProxy(userDao));
        int result = dao.add(10, 20);
        String update = dao.update("123");
        System.out.println(result);
    }
}

class UserDaoProxy implements InvocationHandler {
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法在调用之前获取:"+ method.getName() + "参数为：" + Arrays.toString(args));
        Object invoke = method.invoke(obj, args);
        System.out.println("方法执行之后：" + obj);
        return invoke;
    }
}
