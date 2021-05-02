package com.dao;

import com.model.User;
import com.util.DBUtil;

public class UserDao
{
    //判断数据是否存在
    public static  boolean isExist(String username)
    {
        return DBUtil.userMap.containsKey(username);
    }
    //添加数据
    public static boolean addUser(String username,String password,int age)
    {
        //如果数据存在则添加失败【账号重复】
        if (isExist(username))
        {
            return  false;
        }
        User user=new User(username,password,age,false);
        DBUtil.userMap.put(user.getUsername(),user);
        return  true;
    }
    //判断用户密码是否相互符合
    public  boolean isLogin(String username,String password)
    {
        //先判断账号是否存在
        if (isExist(username))
        {
            return  false;
        }
        //再从数据库中取出数据，进行比较
        User user=DBUtil.userMap.get(username);
        if (!user.getPassword().equals(password))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    //通过账号密码来获取用户对象
    public  User  GetUser(String username,String password)
    {
        //先判断账号是否存在
        if (!isExist(username))
        {
            return  null;
        }

        //再从数据库中取出数据，进行比较
        User user=DBUtil.userMap.get(username);
        if (!user.getPassword().equals(password))
        {
            return null;
        }
        else
        {
            return user;
        }
    }

}
