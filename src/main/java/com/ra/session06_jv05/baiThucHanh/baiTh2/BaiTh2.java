package com.ra.session06_jv05.baiThucHanh.baiTh2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BaiTh2", value = "/baith2")
public class BaiTh2 extends HttpServlet {
    Boolean flag;

    @Override
    public void init() {
        flag = false;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("thuchanh/baiTh2/th2.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String passWord = req.getParameter("password");
        if (userName.equalsIgnoreCase("admin") && passWord.equalsIgnoreCase("admin")) flag = true;
        req.setAttribute("flag", flag);
        req.getRequestDispatcher("thuchanh/baiTh2/success.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}