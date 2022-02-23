package method;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextDouble())
        {
            double a = scanner.nextDouble();
            String b = scanner.next();
            double c = scanner.nextDouble();
            switch (b)
            {
                case "+":
                    System.out.println(a+c);
                    break;
                case "-":
                    System.out.println(a-c);
                    break;
                case "*":
                    System.out.println(a*c);
                    break;
                case "/":
                    System.out.println(a/c);
                    break;
            }
        }
        scanner.close();
    }
}

