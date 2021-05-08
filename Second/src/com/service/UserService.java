package com.service;

import com.dao.UserDao;
import com.model.User;

public class UserService
{
    public static boolean register(String username,String password,int age)
    {
        if (UserDao.isExist(username))
        {
            return  false;
        }
        else
        {
            UserDao.addUser(username, password, age);
            return  true;
        }
    }

    public  static User login(String username, String password)
    {
        return new UserDao().GetUser(username, password);
    }

    public  static  boolean  isExist(String username)
    {
        if (UserDao.isExist(username))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
