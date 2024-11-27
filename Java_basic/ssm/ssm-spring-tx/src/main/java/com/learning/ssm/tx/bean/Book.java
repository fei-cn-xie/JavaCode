package com.learning.ssm.tx.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/27  16:00
 */
@Data
public class Book implements Serializable {
    private Integer id;
    private String bookName;
    private BigDecimal price;
    private Integer stock;

}
