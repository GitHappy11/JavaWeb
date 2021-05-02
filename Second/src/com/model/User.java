package com.model;

public class User
{
    private String username;
    private String password;
    private  int  age;
    private  boolean isAdmin=false;



    public User(String username, String password, int age, boolean isAdmin)
    {
        this.username = username;
        this.password = password;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isAdmin()
    {
        return isAdmin;
    }

    public void setAdmin(boolean admin)
    {
        isAdmin = admin;
    }
}
