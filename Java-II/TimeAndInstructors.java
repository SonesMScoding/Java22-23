import java.util.*;
public class TimesAndInstructors
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in); 

        String courses [][]= {{"CIS101", "Mon 9 am","Kahn"}, 
        {"CIS210", "Mon 11 am", "Patel"}, {"MKT100", "Tues 8:30 am", "Wong"},{"ACC150", "Tues 6 pm", "Deitrich"}, {"CIS101", "Fri 1pm", "Lennon"}, };

        System.out.println("Enter course name: ");
        String courseName = input.nextLine();

        boolean flag = false;

        for(int i=0; i<courses.length; i++)
      {
          if (courses[i][0].equals(courseName)){
              flag = true;
              System.out.println("Course: " + courses[i][0]+"\t Time: "+courses[i][1]+"\t Instructor: "+ courses[i][2]);
          }
      }
    if(!flag){
        System.out.println("Invalid Entry: No Such Course.");
    }
   }
}
