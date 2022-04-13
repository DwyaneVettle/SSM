package com.sccs.spring5;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/22
 **/
public class Book {
    private String bname;
    private String bauthor;

    // 1.生成set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void test() {
        System.out.println(bname + ":" + bauthor);
    }

}
