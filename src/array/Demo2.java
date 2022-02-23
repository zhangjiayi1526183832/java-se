package array;

public class Demo2 {
    public static void main(String[] args) {
        int[] array = new int[10];//定义一个长度为10的整形数组10
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }//array.length表示数组长度
//        int num = 0;
//        for (int i : array) {
//            System.out.println(i);
//        }//增强for循环
        print(reverse(array));
    }

    public static void print(int[] array)//数组作方法形参
    {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] array)//反转数组
    {
        int [] result = new int[array.length];
        for(int i = 0, j = result.length - 1;i< result.length;i++,j--)
        {
            result[j] = array[i];
        }
        return result;
    }
}
