package API;
/*
    Math的基础
 */

//import java.lang.Math;

public class MathApi {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("----------");
        //abs输入整数取绝对值

        System.out.println(Math.ceil(12.23));
        System.out.println(Math.ceil(12.56));
        System.out.println("----------");
        //ceil输入小数取小整数

        System.out.println(Math.floor(12.23));
        System.out.println(Math.floor(12.56));
        System.out.println("----------");
        //floor输入小数取大整数

        System.out.println(Math.round(12.23F));
        System.out.println(Math.round(12.56F));
        System.out.println("----------");
        //round输入小数四舍五入

        System.out.println(Math.max(12,23));
        System.out.println(Math.max(12,56));
        System.out.println("----------");
        //max输入两个整数进行比较，取最大值

        System.out.println(Math.min(12,23));
        System.out.println(Math.min(12,56));
        System.out.println("----------");
        //min输入两个整数进行比较，取最小值

        System.out.println(Math.pow(2.0,4.0));
        System.out.println(Math.pow(4.0,2.0));
        System.out.println("----------");
        //pow输入两小数，输出a的b次方

        System.out.println((int)(Math.random()*100)+1);
        //random创建0.1-1.0的随机数
    }
}
