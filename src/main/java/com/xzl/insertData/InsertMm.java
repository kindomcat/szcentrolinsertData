package com.xzl.insertData;

import com.xzl.util.CommUtil;
import com.xzl.util.Constant;
import com.xzl.util.JDBCUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xzl
 * @create 2018-03-02 9:03
 **/
public class InsertMm {

    public static void main(String[] args) {

        Connection conn = JDBCUtil.getDbConn();
        for (int i = 0; i <100 ; i++) {
            int xx =(int)(Math.random()*5+6);
            try {
                //String sql ="insert into sns_momo (account,regis_nickname,reg_city) values ('"+ CommUtil.getStringRandom((xx))+"','"+CommUtil.getUsername()+"','"+CommUtil.getCity()+"')";
                //String sql ="insert into sns_weibo (type,account,regis_nickname) values('新浪','"+CommUtil.getTel()+"','"+CommUtil.getUsername()+"')";
                String qq =CommUtil.getNum(8)+"@qq.com";
                String qq1 =CommUtil.getNum(8)+"@qq.com";
                String wy =CommUtil.getName()+"@163.com";
                String wy1 =CommUtil.getName()+"@163.com";
                String subject =CommUtil.getOne(Constant.EMAIL_SUBJECT);
                String content ="";
                for (int j = 0; j <3 ; j++) {
                    content+=CommUtil.getOne(Constant.CONTENT);
                }
                long time =System.currentTimeMillis();
                String sql ="insert into sns_email_mails (mail_tool_type,account,email_from,email_to,mail_send_time,mail_subject,mainfile) " +
                        "values ('01999','"+wy+"','"+wy1+"','"+wy+"',"+time+",'"+subject+"','"+content+"')";
                System.out.println(sql);
                PreparedStatement ps = conn.prepareCall(sql);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
