package com.service;

import com.dao.GoodsDao;
import com.model.Goods;

import java.util.List;

public class GoodsService
{
    public List<Goods> GetGoodsLst()
    {
        return new GoodsDao().GetAllGoods();
    }
}
