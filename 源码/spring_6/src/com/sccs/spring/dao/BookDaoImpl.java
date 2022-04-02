package com.sccs.spring.dao;

import com.sccs.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository
public class BookDaoImpl implements BookDao{

    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        // 1.创建sql
        String sql = "insert into t_book values(?,?,?)";
        /*
        * 第一个参数为sql语句，第二个参数为可变参数，sql语句值*/
        Object[] args = {book.getBookId(),book.getBookname(),book.getBstatus()};
        int result = jdbcTemplate.update(sql,args);
        System.out.println(result);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set bookname = ?,bstatus = ? where book_id = ?";
        Object[] args = {book.getBookId(),book.getBookname(),book.getBstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where book_id = ?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.println(delete);
    }

    @Override
    public Book findObject(String bookId) {
        String sql = "select * from t_book where book_id=?";
        // rowmapper是Spring提供的一个接口，返回不同类型的数据，使用这个接口的实现类，完成数据的封装
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), bookId);
        return book;
    }

    // 查询记录数
    @Override
    public int selectBookCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Book> findList() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set bookname = ?,bstatus = ? where book_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where book_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
