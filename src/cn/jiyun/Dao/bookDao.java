package cn.jiyun.Dao;

import cn.jiyun.Utils.jdbcUtils;
import cn.jiyun.pojo.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class bookDao {
    QueryRunner qr = new QueryRunner(jdbcUtils.getDatasource());
    public List<Book> show() throws SQLException {
        return qr.query("select * from stu5",new BeanListHandler<Book>(Book.class));
    }

    public void delete(String bid) throws SQLException {
        qr.update("delete from stu5 where bid = ?",Integer.parseInt(bid));
    }

    public Book updateid(String bid) throws SQLException {

        return qr.query("select * from stu5 where bid = ?",new BeanHandler<Book>(Book.class),Integer.parseInt(bid));
    }

    public void update(Book b) throws SQLException {
        qr.update("update stu5 set bookName = ?,bookPrice = ? where bid = ?",
                b.getBookName(),Integer.parseInt(b.getBookPrice()),b.getBid());
    }

    public void add(Book b) throws SQLException {
        qr.update("insert into stu5 values(null,?,?)",b.getBookName(),Double.parseDouble(b.getBookPrice()));
    }
}
