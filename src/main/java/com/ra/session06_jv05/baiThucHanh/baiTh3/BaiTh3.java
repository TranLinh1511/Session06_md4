package com.ra.session06_jv05.baiThucHanh.baiTh3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BaiTh3", value = "/baith3")
public class BaiTh3 extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("thuchanh/baiTh3/convert.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double rate = Double.parseDouble(req.getParameter("rate"));
        double usd = Double.parseDouble(req.getParameter("usd"));
        double vnd = rate * usd;
        req.setAttribute("rate", rate);
        req.setAttribute("usd", usd);
        req.setAttribute("vnd", vnd);
        req.getRequestDispatcher("thuchanh/baiTh3/show.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}