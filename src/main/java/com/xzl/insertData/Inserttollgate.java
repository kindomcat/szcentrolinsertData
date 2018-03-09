package com.xzl.insertData;

import com.xzl.util.AllConstant;
import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-09 15:14
 **/
public class Inserttollgate {
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getDbConn();

        for (int i = 0; i <200 ; i++) {
            long time = CommUtil.getTime(1483241760, 1514950560) * 1000;
            String aspect =CommUtil.getOne(AllConstant.ASPECT);
            String type =CommUtil.getOne(AllConstant.TYPE);
            try {
                String sql ="insert into loc_car_tollgate values " +
                        "('"+CommUtil.getOne(AllConstant.PLATE)+"','"+CommUtil.getOne(AllConstant.NAME)+"','"+time+"','"+aspect+"',Null,Null,'"+type+"')";
                System.out.println(sql);
                PreparedStatement ps = conn.prepareCall(sql);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
