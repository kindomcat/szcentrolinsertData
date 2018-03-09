package com.xzl;

import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author xzl
 * @create 2018-03-01 14:52
 **/
public class Test {

    public static void main(String[] args) {
        Connection conn = JDBCUtil.getDbConn();
        String sql ="select nick from nick";
        List list  =new ArrayList();
        try {
            ResultSet resultSet = conn.prepareStatement(sql).executeQuery();
            while (resultSet.next()){
                String string = resultSet.getString(1);
                list.add(string);
            }
            System.out.println(list.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
