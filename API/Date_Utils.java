package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Utils {
    private Date_Utils(){}

    public static String s(Date d,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String ss = sdf.format(d);
        return ss;
    }

    public static Date d(String s,String format) throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat(format);
        Date date = sdf2.parse(s);
        return date;
    }
}
