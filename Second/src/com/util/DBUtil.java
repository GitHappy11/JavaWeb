package com.util;

import com.model.Goods;
import com.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//模拟数据库
public class DBUtil
{
    public  static Map<String, User> userMap=new HashMap<String, User>();

    public  static List<Goods> goodsLst=new ArrayList<Goods>();



    //静态代码块 应用启动的时候就会执行（unity的Awake方法）
    static
    {
        addUser(new User("Eleven","123456",21,true));

        addGoods(new Goods("苹果","很好吃的苹果",10,11));
        addGoods(new Goods("香蕉","粗粗的香蕉",20,22));
        addGoods(new Goods("西瓜","大大的西瓜",30,33));

    }

    //添加默认专用
    private static void addUser(User user)
    {
        userMap.put(user.getUsername(),user);
    }

    private static void addGoods(Goods goods)
    {
        goodsLst.add(goods);
    }
}
