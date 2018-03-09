package com.xzl.insertData;

import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-09 13:55
 **/
public class InsertWarnControl {

    public static void main(String[] args) {
        Connection conn = JDBCUtil.getDbConn();

        for (int i = 0; i <40 ; i++) {
            long triggerterm = CommUtil.getTime(1483241760, 1514950560)*1000;
            long controltime = CommUtil.getTime(1483241760, 1514950560)*1000;
            if (controltime>triggerterm){
                long temp =controltime;
                controltime =triggerterm;
                triggerterm =temp;
            }
            try {
                String sql ="insert into warn_control(identitytype,triggercontent,triggerterm,triggertime,controltime,ischeck) values " +
                        "('"+CommUtil.getOne(Constant.IDENTITYTYPE)+"','已达到触发条件','"+CommUtil.getOne(Constant.TREIGGERTERM)+"','"+triggerterm+"','"+controltime+"','v2402')";
                System.out.println(sql);
                PreparedStatement ps = conn.prepareCall(sql);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
