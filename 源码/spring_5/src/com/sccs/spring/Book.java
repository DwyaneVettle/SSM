package com.sccs.spring;

public class Book {

    private String bName;
    private String bAuthor;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getbName() {
        return bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
    /*  public static void main(String[] args) {
        // 无参构造注入
        *//*Book book = new Book();
        book.setbName("java实战");
        System.out.println(book.getbName());*//*
        // 有参构造
        Book book1 = new Book("spring实战");
        System.out.println(book1.bName);
    }*/
}
