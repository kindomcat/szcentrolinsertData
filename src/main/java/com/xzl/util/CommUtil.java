package com.xzl.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @author xzl
 * @create 2018-03-01 14:50
 **/
public class CommUtil {


    /*
     *Author: xzl
     *@Description:随机获得一个字符串里面的一个
     *@Date:10:29 2018/3/6
     */
    public static String getOne(String constant){
        String[] strings = constant.split(",");
        int num = getNum(0, strings.length - 1);
        return strings[num];
    }



    /*
     *Author: xzl
     *@Description:随机生成昵称
     *@Date:10:15 2018/3/2
     */
    public static String getUsername(){
        String[] strings = Constant.WEIXIN.split(",");
        String name ="";
        int a =(int)(Math.random()*5)+3;
        for (int i = 0; i <a ; i++) {
            int v = (int)(Math.random() * 86);
            name+=strings[v];
        }
        return name;
    }

    /*
     *Author: xzl
     *@Description:随机获得全拼音名称
     *@Date:17:11 2018/3/9
     */
    public static String getName(){
        String[] xings = Constant.XING.split(",");
        String[] mings = Constant.MING.split(",");
        String result ="";
        result+=xings[getNum(0,18)];
        for (int i = 0; i <getNum(1,2) ; i++) {
            result+=mings[getNum(0,22)];
        }
        return result;
    }

    /*
     *Author: xzl
     *@Description:随机生成电话号码
     *@Date:11:46 2018/3/2
     */
    public static String getTel() {
        String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String thrid=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+thrid;
    }

    /*
     *Author: xzl
     *@Description:随机生成几位数字
     *@Date:13:48 2018/3/5
     */
    public static String getNum(int num){
        String result ="";
        for (int j = 0; j <num ; j++) {
            int i = getNum(0, 9);
            result+=i;
        }
        return result;
    }

    public static String getRangeNum(int startBit,int endBit){
        String result ="";
        int num = getNum(startBit, endBit);
        for (int i = 0; i <num ; i++) {
            result+=getNum(0,9);
        }
        return result;
    }

    /*
     *Author: xzl
     *@Description:生成一定范围的数字
     *@Date:17:12 2018/3/9
     */
    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }

    /*
     *Author: xzl
     *@Description:17年1月1日 到18年3月10日
     *@Date:17:30 2018/3/9
     */
    public static long get17to18(){
        return getTime(1483200000,1520611200)*1000;
    }

    /*
     *Author: xzl
     *@Description:生成一段时间
     *@Date:17:12 2018/3/9
     */
    public static long getTime(int start,int end) {
        return (long)(Math.random()*(end-start+1)+start);
    }

    /*
     *Author: xzl
     *@Description:随机生成几位数字和字母
     *@Date:10:20 2018/3/2
     */
    public static String getStringRandom(int length) {
        String val = "";
        Random random = new Random();
        //参数length，表示生成几位随机数
        for(int i = 0; i < length; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if( "char".equalsIgnoreCase(charOrNum) ) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char)(random.nextInt(26) + temp);
            } else if( "num".equalsIgnoreCase(charOrNum) ) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }
    /*
     *Author: xzl
     *@Description:随机生成汉字
     *@Date:14:50 2018/3/1
     */
    public static String getRandomJianHan(int len)
    {
        String ret="";
        for(int i=0;i<len;i++){
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); //获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); //获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try
            {
                str = new String(b, "GBk"); //转成中文
            }
            catch (UnsupportedEncodingException ex)
            {
                ex.printStackTrace();
            }
            ret+=str;
        }
        return ret;
    }

    private static String firstName="赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁童颜郭梅盛林夏蔡田樊胡凌霍虞万支柯咎管卢莫经房干解应宗宣全班仰秋仲伊";
    private static String girl="秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ";
    private static String boy="伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";

    public static String name_sex = "";
    public static String getChineseName() {
        int index=getNum(0, firstName.length()-1);
        String first=firstName.substring(index, index+1);
        int sex=getNum(0,1);
        String str=boy;
        int length=boy.length();
        if(sex==0){
            str=girl;
            length=girl.length();
            name_sex = "女";
        }else {
            name_sex="男";
        }
        index=getNum(0,length-1);
        String second=str.substring(index, index+1);
        int hasThird=getNum(0,1);
        String third="";
        if(hasThird==1){
            index=getNum(0,length-1);
            third=str.substring(index, index+1);
        }
        return first+second+third;
    }

}
