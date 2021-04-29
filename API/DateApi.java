package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateApi {
    public static void main(String[] args) throws ParseException {

//        Date d = new Date();
//        System.out.println(d.getTime()*1.0/1000/60/60/24/365);
//
//        long time = 1000*60*60;
//        d.setTime(time);
//        System.out.println(d);

        Date dd = new Date();
//        System.out.println(dd);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(dd);
        System.out.println(s);

        String ss = "2021-4-28 21:26:34";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse2 = sdf2.parse(ss);
        System.out.println(parse2);
    }
}
