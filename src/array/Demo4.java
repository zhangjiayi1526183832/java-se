package array;

public class Demo4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 9;
        long num = a[0];
        for(int i=1;i<10;i++)
        {
            a[i] = a[i-1]*10+9;
            num+=a[i];
        }
        System.out.print(num);
    }
}
