package API;
/*
    System的基础知识
 */

public class SystemApi {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());


        System.out.println("开始");

        System.exit(0);
        //结束当前虚拟机


        System.out.println("结束");

        long start = System.currentTimeMillis();
        //返回当前时间，以毫秒为单位

        for (int i = 0; i < 10000; i++) {

            System.out.println(i);

        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");

    }
}
