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

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String bid = request.getParameter("bid");
        String bookName = request.getParameter("bookName");
        String bookPrice = request.getParameter("bookPrice");
        Book b = new Book(Integer.parseInt(bid),bookName,bookPrice);
        System.out.println(b.toString());
        bookServices bs = new bookServices();
        try {
            bs.add(b);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getRequestDispatcher("showServlet").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
