package scanner;

public class Demo6 {
    public static void main(String[] args)
    {
        for (int j = 1; j <=9; j++)
        {
            for (int i = 1; i <=j; i++)
            {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
