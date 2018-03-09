package com.xzl.insertData;

import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-09 9:25
 **/
public class InsertSnsPhone {

    public static void main(String[] args) {
        Connection conn = JDBCUtil.getDbConn();
        for (int j = 0; j <10 ; j++) {
            String tel = CommUtil.getTel();
            String name=CommUtil.getChineseName();
            int num = CommUtil.getNum(2, 4);
            for (int i = 0; i <num ; i++) {
                String imei = CommUtil.getOne(Constant.ID);
                try {
                    String sql ="insert into sns_phone_maillist values " +
                            "('"+ imei +"','"+tel+"','"+name+"','"+Constant.name.get(imei)+"','"+Constant.phone.get(imei)+"','"+CommUtil.getOne(Constant.RELATIONSHIP)+"')";
                    PreparedStatement ps = conn.prepareCall(sql);
                    ps.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
