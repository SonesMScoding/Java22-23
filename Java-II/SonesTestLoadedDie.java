public class SonesTestLoadedDie {

        final static int TIMES = 1000;
        static int count = 0;
        static int Loadedcount = 0;
        //static boolean W = false;



    public static void rollDice(){
        
      SonesDie die1 = new SonesDie();
      SonesDie die2 = new SonesDie();

     // int die1value = die1.getValue();
    

     // if(W = true){
      //      die1value++;
     // }
      //else{
      //  W = false;
      //}
        
      
        //if( die1value > die2.getValue()){
        if(die1.getValue() > die2.getValue())
            count++;
            //W = true;
            
        }
               
            
        public static void rollLoadedDice()
        {
            SonesDie die1 = new SonesDie();
            SonesLoadedDie die3 = new SonesLoadedDie();
        
            if(die3.getValue() > die1.getValue()){
                    Loadedcount++;
            }
        }



            public static void main(String[] args){

                for(int i =0; i < TIMES; i++){

                    rollDice();

                    rollLoadedDice();

                }

                System.out.print("The first die won " + count + " times!");
                System.out.print("The first die won " + Loadedcount + " times the second match!");
            }


        
    }


