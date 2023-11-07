package com.ra.session06_jv05.baitap;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountServlet", value = "/discountservlet")
public class DiscountServlet extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("baitap/bai1/display-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String des = req.getParameter("description");
        String listedPrice = req.getParameter("listedPrice");
        String discountPercent = req.getParameter("discountPercent");
        req.setAttribute("des", des);
        req.setAttribute("listedPrice", listedPrice);
        req.setAttribute("discountPercent", discountPercent);
        req.getRequestDispatcher("baitap/bai1/display-discount.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}