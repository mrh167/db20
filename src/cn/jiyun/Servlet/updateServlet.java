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

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String bid = request.getParameter("bid");
//        bid = new String(bid.getBytes("ISO-8859-1"),"utf-8");
        String bookName = request.getParameter("bookName");
        String bookPrice = request.getParameter("bookPrice");
        System.out.println(bid+bookName+bookPrice);
        Book b = new Book(Integer.parseInt(bid),bookName,bookPrice);
        bookServices bs = new bookServices();
        try {
            bs.update(b);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getRequestDispatcher("showServlet").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        bookServices bs = new bookServices();
        String bid = request.getParameter("bid");
        Book b = null;
        try {
            b = bs.updateid(bid);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("book",b);
        request.getRequestDispatcher("updateBook.jsp").forward(request, response);
    }
}
