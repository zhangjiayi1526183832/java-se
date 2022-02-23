package array;

import java.util.Arrays;

public class Arrayclass {
    public static void main(String[] args) {
        int[] a = {125,5425,4567,124,856784,234};
        System.out.println(a);
        System.out.println(Arrays.toString(a));//打印数组元素
        Arrays.sort(a);//对数组进行升序排序
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0);//对数组每个元素进行赋值
        System.out.println(Arrays.toString(a));
    }
}
