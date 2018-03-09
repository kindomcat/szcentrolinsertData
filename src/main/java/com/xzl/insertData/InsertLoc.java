package com.xzl.insertData;

import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-06 11:19
 **/
public class InsertLoc {
    public static void main(String[] args) {

        Connection conn = JDBCUtil.getDbConn();

        for (int i = 0; i <100 ; i++) {
            try {
                String id = Constant.ID;
                String sql ="insert into loc_travel (idtype,idno,idname,phone) values " +
                        "('v0301','"+CommUtil.getOne(id)+"','"+Constant.name.get(id)+"')";
                System.out.println(sql);
                PreparedStatement ps = conn.prepareCall(sql);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
