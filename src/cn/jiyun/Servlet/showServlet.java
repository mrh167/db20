package cn.jiyun.Servlet;

import cn.jiyun.Services.bookServices;
import cn.jiyun.pojo.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/showServlet")
public class showServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        bookServices bs = new bookServices();
        List<Book> list = null;
        try {
            list = bs.show();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("list",list);
        request.getRequestDispatcher("Show.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
