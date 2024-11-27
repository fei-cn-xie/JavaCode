package com.learning.ssm.tx.dao;

import com.learning.ssm.tx.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  16:03
 */
@Component
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Book getBookById(Integer id) {
        String sql = "select * from book where id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    public int insertBook(Book book) {
        String sql = "insert into book(bookName, price, stock) values( ?, ?, ?)";
        int update = jdbcTemplate.update(sql, book.getBookName(), book.getPrice(), book.getStock());
        return update;
    }

    public List<Book> getBooks() {
        String sql = "select * from book";
        List<Book> books = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Book.class));
        return books;
    }

    public int updateBookStock(Integer id, Integer number) {
        String sql = "update book set stock = stock - ? where id = ?";
        int update = jdbcTemplate.update(sql, number, id);
        return update;
    }

    public int deleteBook(Integer id) {
        String sql = "delete from book where id = ?";
        int update = jdbcTemplate.update(sql, id);
        return update;
    }
}
