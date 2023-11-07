package com.ra.session06_jv05.baiThucHanh.baiTh4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BaiTh4", value = "/baith4")
public class BaiTh4 extends HttpServlet {
    private Map<String, String> dictionary = new HashMap<>();
    private String result = null;

    @Override
    public void init() {
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("thuchanh/baiTh4/dictionary.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        result = dictionary.get(req.getParameter("txtSearch"));
        req.setAttribute("result", result);
        req.getRequestDispatcher("thuchanh/baiTh4/show.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
    }
}