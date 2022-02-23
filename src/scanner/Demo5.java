package scanner;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = 0.0f;
        int n = 0;
        while(scanner.hasNextFloat())
        {
            double v = scanner.nextFloat();
            n++;
            num+=v;
        }
        System.out.println(n+"个数的总和为"+num);
        System.out.println(n+"个数的平均数为"+num/n);
        scanner.close();
    }
}
