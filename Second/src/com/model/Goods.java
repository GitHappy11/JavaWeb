package com.model;

public class Goods
{
    private String name;
    private String des;
    private  int  price;
    private  int inventory;

    public Goods(String name, String des, int price, int inventory)
    {
        this.name = name;
        this.des = des;
        this.price = price;
        this.inventory = inventory;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDes()
    {
        return des;
    }

    public void setDes(String des)
    {
        this.des = des;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getInventory()
    {
        return inventory;
    }

    public void setInventory(int inventory)
    {
        this.inventory = inventory;
    }
}
