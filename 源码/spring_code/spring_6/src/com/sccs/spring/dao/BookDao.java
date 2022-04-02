package com.sccs.spring.dao;

import com.sccs.spring.entity.Book;

import java.util.List;

public interface BookDao {
    // 添加
    void addBook(Book book);

    // 修改
    void updateBook(Book book);
    // 删除
    void deleteBook(String id);

    //查询返回对象
    Book findObject(String bookId);

    // 查询记录数
    int selectBookCount();
    // 查询返回集合
    List<Book> findList();
    // 实现批量添加
    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
