package com.ra.session06_jv05.baiThucHanh.baiTh1;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BaiTh1", value = "/baith1")
public class BaiTh1 extends HttpServlet {
    private Date date = new Date();

    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("date", date);
        req.getRequestDispatcher("thuchanh/baiTh1/localTime.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    public void destroy() {
    }
}