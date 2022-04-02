package com.sccs.spring;

public class Order {
    private String oname;
    private String oaddr;

    public Order(String oname, String oaddr) {
        this.oname = oname;
        this.oaddr = oaddr;
    }

    public String getOname() {
        return oname;
    }

    public String getOaddr() {
        return oaddr;
    }

    public void test() {
        System.out.println("test()方法执行了。。。。");
    }

  /*  public static void main(String[] args) {
        Order order = new Order("java", "成都");
    }*/
}
