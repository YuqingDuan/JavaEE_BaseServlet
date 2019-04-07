package cn.itcast.store.web.base;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取客户端提交到服务端的method对应的值
        String method = request.getParameter("method");
        // 定义变量, 存放功能执行完毕之后要转发的路径
        String path = null;
        // 通过判断method中不同的内容来决定本次功能
        if ("addStu".equals(method)) {
            path = addStu(request, response);
        } else if ("delStu".equals(method)) {
            path = delStu(request, response);
        } else if ("checkStu".equals(method)) {
            path = checkStu(request, response);
        } else if ("".equals(method)) {

        }

        // 转发操作
        if (null != path) {
            //服务端的转发
            request.getRequestDispatcher(path).forward(request, response);
        }
    }

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
