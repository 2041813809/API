package API;
/*
    冒泡排序
 */

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {112, 245, 324, 45, 526, 617, 178, 289,};
        System.out.println(ArrayToString(arr));

        for (int x = 0; x < arr.length-1; x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {


                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(ArrayToString(arr));
    }

    public static String ArrayToString(int[] arr){
        System.out.print("[");

        for (int a = 0;a<arr.length;a++){
            if (a<arr.length-1){
                System.out.print(arr[a]);
                System.out.print(", ");
            }else {
                System.out.print(arr[a]);
            }
        }
        System.out.println("]");
        String s = arr.toString();
        return s;
    }
}
