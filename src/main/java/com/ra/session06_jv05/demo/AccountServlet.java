package com.ra.session06_jv05.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "account", value = "/register")
public class AccountServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("account.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Nhận dữ liệu từ form
        String userName = req.getParameter("userName");
        System.out.println(req.getParameter("userName"));
        req.setAttribute("userName", userName);
        req.getRequestDispatcher("thanks.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
    }
}
