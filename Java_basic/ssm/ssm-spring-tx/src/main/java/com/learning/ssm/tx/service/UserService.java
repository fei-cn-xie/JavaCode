package com.learning.ssm.tx.service;

/**
  * Author fei
  * Version 1.0
  * Description TODO
  * DATA 2024/11/27  16:48
  */public interface UserService {
    /**
     * 用户结账的方法
     * @param username 用户名
     * @param bookId 购买书的ID
     * @param buyBum 购买数量
     */
      void checkout(String username, Integer bookId, Integer buyBum);
}
