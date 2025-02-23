import java.util.Scanner;

public class AddingRecursively {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x, y, result;

        System.out.print("Enter a number: ");
        x = in.nextInt();

        System.out.print("Enter a larger number: ");
        y = in.nextInt();

        result = sum(x, y);

        System.out.println("The sum of all the numbers between "+x+" and "+y+" is "+result);


    }
    public static int sum(int x, int y)
    {
        if(y > x )
        return y + sum(x, y-1);
        
        return y;
    }

}
