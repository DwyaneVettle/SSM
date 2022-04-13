package com.sccs.spring.proxy;

import com.sccs.spring.dao.UserDao;
import com.sccs.spring.dao.UserDaoImpl;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result=" + result);
    }
}

// 创建InvocationHandler的代理类
class UserDaoProxy implements InvocationHandler {
    // 创建UserDaoImpl的代理对象，把它传递过来
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // 书写增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行。。。。" + method.getName() + ";传递的参数：" + Arrays.toString(args));
        // 被增强的方法执行
        Object res = method.invoke(obj, args);
        // 方法之后
        System.out.println("方法之后执行。。。。" + obj);
        return res;
    }
}

