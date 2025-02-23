public class CountByFives{
    public static void main(String[] args){

        final int START = 5;
        final int STOP = 500;


        for (int i = START; i < STOP; i = i + 5)
        {
            System.out.println(i + ", ");
        }
    }
}
