package com.xzl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-01 17:46
 **/
public class JDBCUtil {

    public static Connection dbConn = null;

    static {
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // 加载JDBC驱动
        // 连接服务器和数据库ServletUser
        String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=insertdata";
        String userName = "sa"; // 默认用户名
        String userPwd = "123"; // 密码
        try {
            Class.forName(driverName);
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            //System.out.println("Connection Successful!"); // 如果连接成功
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getDbConn(){
        return dbConn;
    }


}
