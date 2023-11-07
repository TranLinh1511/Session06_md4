package com.ra.session06_jv05.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "studentServlet", value = ("/student-manager"))
public class StudentServlet extends HttpServlet {
    private static final List<Student> students = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        students.add(new Student("B001", "Trần Linh", 18, true));
        students.add(new Student("B002", "Nguyễn Hoàng", 21, true));
        students.add(new Student("B003", "Hồ Tiến", 18, true));
        students.add(new Student("B004", "Văn Thắng", 18, true));
        students.add(new Student("B005", "Đặng Phượng", 20, false));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students", students);
        req.getRequestDispatcher("student_manager.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
