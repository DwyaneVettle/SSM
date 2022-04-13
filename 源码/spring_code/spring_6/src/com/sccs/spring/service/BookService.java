package com.sccs.spring.service;

import com.sccs.spring.dao.BookDao;
import com.sccs.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    // 输入Dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    // 修改
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    // 删除
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    // 查询返回某个值
    public int findCount() {
        return bookDao.selectBookCount();
    }

    // 查询返回对象
    public Book findObject(String bookId) {
        return bookDao.findObject(bookId);
    }

    // 查询返回集合
    public List<Book> findList() {
        return bookDao.findList();
    }

    // 批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    // 批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }

    // 批量修改
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDelete(batchArgs);
    }
}
