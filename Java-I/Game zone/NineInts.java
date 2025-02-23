public class NineInts{
    public static void main(String[] args){
        int[] numbers = {10, 15, 24, 36, 45, 54, 66, 77, 85};

    for(int i = 0; i<numbers.length; i++){
        System.out.print(numbers[i] + " ");
    }
    System.out.println();
    for(int i = numbers.length - 1; i >= 0; i-- )
{
    System.out.print(numbers[i] + " ");
}    
    

    }

}
