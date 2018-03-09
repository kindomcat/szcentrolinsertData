package com.xzl.insertData;

import com.xzl.util.CommUtil;
import com.xzl.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author xzl
 * @create 2018-03-07 17:37
 **/
public class UpdateLoc {

    public static void main(String[] args) throws Exception{
        update1();
        update2();
        update3();
        update4();
        update5();
    }

    public static void update1() throws Exception{
        Connection conn = JDBCUtil.getDbConn();
        String num = CommUtil.getNum(4);
        long s =1510181100;
        long e=1510187100;
        long a =Long.valueOf(CommUtil.getRangeNum(6,8));
        long stime =(s+a)*1000;
        long etime=(e+a)*1000;
        for (int i = 0; i <2 ; i++) {
            String sql ="update loc_travel1 set tripno='MU"+ num+"',stime='"+stime+"',etime='"+etime+"' where tocity='大理'";
            System.out.println(sql);
            PreparedStatement ps = conn.prepareCall(sql);
            ps.executeUpdate();
        }
    }

    public static void update2() throws Exception{
        Connection conn = JDBCUtil.getDbConn();
        String num = CommUtil.getNum(4);
        long s =1504911300;
        long e=1504922100;
        long a =Long.valueOf(CommUtil.getRangeNum(6,8));
        long stime =(s+a)*1000;
        long etime=(e+a)*1000;
        for (int i = 0; i <2 ; i++) {
            String sql ="update loc_travel1 set tripno='CA"+ num+"',stime='"+stime+"',etime='"+etime+"' where tocity='北京'";
            System.out.println(sql);
            PreparedStatement ps = conn.prepareCall(sql);
            ps.executeUpdate();
        }
    }

    public static void update3() throws Exception{
        Connection conn = JDBCUtil.getDbConn();
        String num = CommUtil.getNum(4);
        long s =1499561700;
        long e=1499563560;
        long a =Long.valueOf(CommUtil.getRangeNum(6,8));
        long stime =(s+a)*1000;
        long etime=(e+a)*1000;
        for (int i = 0; i <2 ; i++) {
            String sql ="update loc_travel1 set tripno='G"+ num+"',stime='"+stime+"',etime='"+etime+"' where tocity='资阳'";
            System.out.println(sql);
            PreparedStatement ps = conn.prepareCall(sql);
            ps.executeUpdate();
        }
    }

    public static void update4() throws Exception{
        Connection conn = JDBCUtil.getDbConn();
        String num = CommUtil.getNum(4);
        long s =1502241360;
        long e=1502248560;
        long a =Long.valueOf(CommUtil.getRangeNum(6,8));
        long stime =(s+a)*1000;
        long etime=(e+a)*1000;
        for (int i = 0; i <2 ; i++) {
            String sql ="update loc_travel1 set tripno='G"+ num+"',stime='"+stime+"',etime='"+etime+"' where tocity='德阳'";
            System.out.println(sql);
            PreparedStatement ps = conn.prepareCall(sql);
            ps.executeUpdate();
        }
    }

    public static void update5() throws Exception{
        Connection conn = JDBCUtil.getDbConn();
        String num = CommUtil.getNum(7);
        long s =1515453480;
        long e=1515468960;
        long a =Long.valueOf(CommUtil.getRangeNum(6,8));
        long stime =(s+a)*1000;
        long etime=(e+a)*1000;
        for (int i = 0; i <2 ; i++) {
            String sql ="update loc_travel1 set tripno='KC"+ num+"',stime='"+stime+"',etime='"+etime+"' where tocity='泸州'";
            System.out.println(sql);
            PreparedStatement ps = conn.prepareCall(sql);
            ps.executeUpdate();
        }
    }


}
