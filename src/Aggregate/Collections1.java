package Aggregate;

import java.util.*;

public class Collections1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(100);
        list.add(50);
        list.add(60);
        list.add(710);
        list.add(80);
        Collections.sort(list);//排序
        System.out.println(list.toString());
        System.out.println(Collections.binarySearch(list, 710));//二分查找

        List<Integer> mist = new ArrayList<>();//复制
        for (int i = 0; i < list.size(); i++) {
            mist.add(0);
        }
        Collections.copy(mist,list);
        System.out.println(mist.toString());

        Collections.reverse(list);//反转
        System.out.println(list.toString());

        Collections.shuffle(list);//打乱
        System.out.println(list.toString());

        //list转化成数组
        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        //数组转化成集合
        String[] strings = {"zhangsan","lisi","wangwu"};
        List<String> list2 = Arrays.asList(strings);//受限集合，不能添加和删除
        System.out.println(list2);


    }
}
