package com.example.FirstJavaWeb;
import com.user.model.User;
import java.util.Map;
import java.util.HashMap;

public  class DBUtil
{
    public static Map<String, User> userDB= new HashMap<String,User>() ;

    public  static boolean  AddUser(String username,String password,int age,String sex)
    {
        //字典中用户名重复则注册失败
        if (userDB.containsKey(username))
        {
            return false;
        }
        else
        {
            User user=new User(username,password,age,sex);
            userDB.put(username,user);
            return  true;
        }
    }

    public  static  User VerifyAccount(String username,String password)
    {
        if (userDB.containsKey(username))
        {
            User user=userDB.get(username);
            if (user.getPassword().equals(password))
            {
                return  user;
            }
            else
            {
                return null;
            }
        }
        return  null;
    }
}
