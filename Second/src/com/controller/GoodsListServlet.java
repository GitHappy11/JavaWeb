package com.controller;

import com.model.Goods;
import com.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GoodsListServlet")
public class GoodsListServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<Goods> goodsLst=new GoodsService().GetGoodsLst();
        if (goodsLst!=null)
        {

            request.setAttribute("goodsLst",goodsLst);
            request.getRequestDispatcher("goodList.jsp").forward(request,response);

        }
        else
        {
            System.out.println("---");
        }

    }
}
