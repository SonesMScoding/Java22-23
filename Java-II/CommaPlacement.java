// Write your code here
import java.util.*;

public class CommaPlacement{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String value;

        List<String> lyst =  new ArrayList<String>();

        System.out.println("Enter a word or ZZZ to quit >>");

        while(true){
            value = in.next();
            if(value.equals("ZZZ"))
                break;
            else{
                lyst.add(value);
            }
        }
        Iterator<String> iter = lyst.iterator();
        while(iter.hasNext()){
            String i = iter.next();
            System.out.println(lyst);
            System.out.println(("Enter a word or ZZZ to quit >>"));
            value = in.nextLine();


            System.out.println(lyst);
         
            return;
        }
    }
}
