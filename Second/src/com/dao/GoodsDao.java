package com.dao;

import com.model.Goods;
import com.util.DBUtil;

import java.util.List;

public class GoodsDao
{
    public  List<Goods> GetAllGoods()
    {
        return DBUtil.goodsLst;
    }
}
