package com.xzl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author xzl
 * @create 2018-03-07 17:04
 **/
public class TestData {
    private static BufferedReader br = null;
    private static InputStreamReader InputStream = null;
    private static File file = null;
    public static void main(String[] args) {
        file = new File("C:/Users/xushunli/Desktop/insertData/loc_travel.txt");

        try {
            InputStream = new InputStreamReader(new FileInputStream(file),"gb2312");
            br = new BufferedReader(InputStream);
            List<Map> list = new ArrayList<>();
            String temp = "";
            while ((temp = br.readLine()) != null) {
                String[] each = temp.split(",,", -1);
                String IDTYPE = each[0];
                String IDNO = each[1];
                String NAME = each[2];
                String PHONE = each[3];
                String FROMCITY = each[4];
                String TOCITY = each[5];
                String STIME = each[6];
                String ETIME = each[7];
                String TRIPMODE = each[8];
                String TRIPNO = each[9];
                String BOOKINGNO = each[10];
                String COMPANY = each[11];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
