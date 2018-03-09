package com.xzl.insertData;

import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-06 13:57
 **/
public class InsertBrowser {
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getDbConn();

        for (int i = 0; i <200 ; i++) {
            int xx =(int)(Math.random()*5+6);
            try {
                String sql ="insert into cont_browser_favorities (imei,browse_type,url,create_time) values" +
                        "('"+CommUtil.getNum(18)+"','"+CommUtil.getOne(Constant.BROWSER)+"','"+CommUtil.getOne(Constant.URL)+"','"+System.currentTimeMillis()+"')";
/*                String sql ="insert into busi_eshop_account (imei,network_app,account,regis_nickname,phone) values" +
                        "('"+CommUtil.getNum(18)+"','"+CommUtil.getOne(Constant.NETWORK)+"','"+CommUtil.getStringRandom(xx)+"','"+CommUtil.getUsername()+"','"+CommUtil.getTel()+"')";
                System.out.println(sql);*/
                PreparedStatement ps = conn.prepareCall(sql);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
