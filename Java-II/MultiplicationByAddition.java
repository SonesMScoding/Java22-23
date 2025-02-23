import java.util.Scanner;

public class MultiplicationByAdding {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x, y, result;

        System.out.print("Enter a number: ");
        x = in.nextInt();

        System.out.print("Enter another number: ");
        y = in.nextInt();

        result = sum(x, y);

        System.out.println(x+" + "+y+"  = "+result);

    }
    public static int sum(int x, int y)
    {
        int z;
        for(int i = 0; i < y; ++i)
      {
        z += x;
      }
        return z;
    }

}
