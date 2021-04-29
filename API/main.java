package API;
/*
    1：定义一个字符串s

    2：定义一个字符串数组sg，调用s并用split方法分割元素，得到每一个元素

    3：定义一个数组arr，并采用sg的数组长度

    4：使用for循环把sg的每一个元素赋值为arr，使用”arr[i] =Integer.parseInt(sg[i])“方法进行类型转换并赋值

    5：使用Arrays.sort方法对arr进行冒泡排序

    6：创建StringBuilder字符串空数组，并对arr的元素进行添加排列

    7：把StringBuilder类型转换为String类型

    8：打印结果
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        String s ="23,12,56,45,65";

        String[] sg = s.split(",");

        int[] arr = new int[sg.length];

        for (int i = 0;i<arr.length;i++){
            arr[i] =Integer.parseInt(sg[i]);
//            System.out.println(arr[i]);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        System.out.print("[");
        for (int i = 0;i<arr.length;i++){
            if (i<arr.length-1){
                sb.append(arr[i]).append(",");
            }else {
                sb.append(arr[i]);
            }
        }
        String s1 = sb.toString();
        System.out.print(s1);
        System.out.println("]");

//        Integer i = 100;
//        System.out.println(i);
//        i += 100;
//        System.out.println(i);
//        自动装箱与拆箱
    }
}
