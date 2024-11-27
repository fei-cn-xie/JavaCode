package com.learning.ssm.tx.service.impl;

import com.learning.ssm.tx.bean.Book;
import com.learning.ssm.tx.dao.AccountDao;
import com.learning.ssm.tx.dao.BookDao;
import com.learning.ssm.tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  16:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AccountDao accountDao;

    @Transactional
    @Override
    public void checkout(String username, Integer bookId, Integer buyBum) {
        //1. 查询书本信息
        Book bookById = bookDao.getBookById(bookId);

        // 1.1 计算扣减额度
        BigDecimal multiply = new BigDecimal(buyBum).multiply(bookById.getPrice());

        //2. 修改账户金额
        accountDao.updateBalanceByUsername(username,multiply);

        //3. 修改库存
        bookDao.updateBookStock(bookId,buyBum);

//        int n = 3/0;
    }
}
