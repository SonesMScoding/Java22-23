// Write your code here
public class JobApplicant 

{ 

 

   private String name; 

   private String phone; 

   private boolean hasWordSkill; 

   private boolean hasSpreadsheetSkill; 

   private boolean hasDatabaseSkill; 

   private boolean hasGraphicsSkill; 

 

   public JobApplicant() 

   { 

 

   } 

 

   public JobApplicant(String n, String p, boolean word, boolean spreadSheet, boolean database, boolean graphics) 

   { 

      name = n; 

      phone = p; 

      hasWordSkill = word; 

      hasSpreadsheetSkill = spreadSheet; 

      hasDatabaseSkill = database; 

      hasGraphicsSkill = graphics; 

   } 

 

   public String getName() 

   { 

      return name; 

   } 

 

   public String getPhone() 

   { 

      return phone; 

   } 

 

   public boolean getHasWordSkill() 

   { 

      return hasWordSkill; 

   } 

 

   public boolean getHasSpreadsheetSkill() 

   { 

      return hasSpreadsheetSkill; 

   } 

 

   public boolean getHasDatabaseSkill() 

   { 

      return hasDatabaseSkill; 

   } 

 

   public boolean getHasGraphicsSkill() 

   { 

      return hasGraphicsSkill; 

   } 
}
