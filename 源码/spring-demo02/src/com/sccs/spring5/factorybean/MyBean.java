package com.sccs.spring5.factorybean;

import com.sccs.spring5.conllection.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {
    // 定义返回Bean的返回类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("Spring框架学习");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
