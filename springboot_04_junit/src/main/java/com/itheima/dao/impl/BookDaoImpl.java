package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * ClassName: BookDaoImpl
 * Package: com.itheima.dao.impl
 * Description：
 *
 * @Author :zyp
 * @Create 2023/08/04 23:04
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDaoImpl is running");
    }
}
