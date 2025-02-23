import java.util.Scanner;

public class MultiplicationByAdding {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x, y, result;

        System.out.print("Enter a number: ");
        x = in.nextInt();
        result = x;

        System.out.print("Enter another number: ");
        y = in.nextInt();
 
        for(int i = 1; i<y; i++){
            
                result += x;
        }

        System.out.println(x+" * "+y+"  = "+result);

    }

    public static int multiply(int x, int y)
    {
        if(y==0 || x == 0 )
            return 0 ;
        else{
            if(x == 1)
            return y;
        
            else
            return y + multiply(x-1, y);
        }
    }
}
