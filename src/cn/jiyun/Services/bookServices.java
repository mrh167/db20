package cn.jiyun.Services;

import cn.jiyun.Dao.bookDao;
import cn.jiyun.pojo.Book;

import java.sql.SQLException;
import java.util.List;

public class bookServices {
    bookDao bd = new bookDao();
    public List<Book> show() throws SQLException {
        return bd.show();
    }

    public void delete(String bid) throws SQLException {
        bd.delete(bid);
    }

    public Book updateid(String bid) throws SQLException {
        return bd.updateid(bid);
    }

    public void update(Book b) throws SQLException {
        bd.update(b);
    }

    public void add(Book b) throws SQLException {
        bd.add(b);
    }
}
