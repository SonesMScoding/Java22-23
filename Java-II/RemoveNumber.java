import java.util.*;

public class RemoveNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int number;
        String value;

        List<Integer> lyst =  new ArrayList<Integer>();

        System.out.println("Enter integers or ZZZ to stop: ");

        while(true){
            value = in.next();
            if(value.equals("ZZZ"))
                break;
            else{
                int tmp = Integer.parseInt(value);
                lyst.add(tmp);
            }
        }
        Iterator<Integer> iter = lyst.iterator();
        while(iter.hasNext()){
            int i = iter.next();
            System.out.println(lyst);
            System.out.println(("Enter a number to eliminate >> "));
            number = in.nextInt();

            if(iter.next().equals(number)){
                iter.remove();
            }

            System.out.println(lyst);
         
            return;
        }
    }
}
