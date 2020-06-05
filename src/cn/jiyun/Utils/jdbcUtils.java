package cn.jiyun.Utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class jdbcUtils {
    //创建连接池对象
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    public static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //获取整个连接池对象
    public static DataSource getDatasource(){
        return dataSource;
    }
}
