package com.isa.usersengine;

import com.isa.usersengine.dao.UsersRepositoryDao;
import com.isa.usersengine.dao.UsersRepositoryDaoBean;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();
        usersRepositoryDao.getUsersList().stream().map(user -> user.getName()).forEach(System.out::println);
    }
}
