package API;
/*
    把字符串 "91 27 56 38 50" 转换为 "27 38 50 56 91"
 */

import java.util.Arrays;

public class ArraysApi {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //定义一个字符串

        String[] s1 = s.split(" ");
        //使用split方法把String s 变成String数组

        int[] arr = new int[s1.length];
        for (int i = 0;i< arr.length;i++){

            arr[i] = Integer.parseInt(s1[i]);
            //把String类型转换为int类型
        }
        //把s1数组存储到一个int数组 arr 中

        Arrays.sort(arr);
        //Arrays排序方法对arr进行排序

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i< arr.length;i++){
            if (i == args.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        //创建StringBuilder数组进行对排序好的数组进行拼接

        String s2 = sb.toString();
        //把StringBuilder类型转换为String类型

        System.out.println(s2);

    }
}
