package cn.itcast.store.web.base;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo03 extends BaseServlet {
    public String addStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("add student");
        return "/test.html";
    }

    public String delStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("delete student");
        return "/test.html";
    }

    public String checkStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("check student");
        response.getWriter().println("DDDDDD");
        return null;
    }
}
