package array;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = new int[10];//定义一个长度为10的整形数组10
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }//array.length表示数组长度
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num+=array[i];
        }
        System.out.println("数组的总和为："+num);
    }
}
