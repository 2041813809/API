package API;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderApi {
    public static void main(String[] args) {
        Calendar cd = Calendar.getInstance();

//        int year = cd.get(Calendar.YEAR);
//        int month = cd.get(Calendar.MONTH)+1;
//        int date = cd.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

//        cd.add(Calendar.YEAR,-3);
//        cd.add(Calendar.MONTH,-3);
//        cd.add(Calendar.DATE,-3);
//        int year = cd.get(Calendar.YEAR);
//        int month = cd.get(Calendar.MONTH)+1;
//        int date = cd.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

//        cd.set(2077,10,10);
//        int year = cd.get(Calendar.YEAR);
//        int month = cd.get(Calendar.MONTH)+1;
//        int date = cd.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");


        Scanner sr = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sr.nextInt();
        System.out.println("请输入月份");
        int month = sr.nextInt();

        cd.set(year,month,1);
        cd.add(Calendar.DATE,-1);
        int date = cd.get(Calendar.DATE);

        System.out.println(year+"年的"+month+"月分共有"+date+"天");

    }
}
