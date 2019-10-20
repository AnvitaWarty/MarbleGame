 public class Marble
 {
  private String color; 
  private int value;  
  
  public Marble(int value)
  {
   this.value = value; 
    
   switch(value)
   { 
    case 1: 
      color = "Red";
      break;
    case 2: 
      color = "Green"; 
      break;
    case 3: 
      color = "Yellow"; 
      break;
    case 4: 
      color = "Blue"; 
      break; 
    }
  }

   public int getValue() 
   {
    return value;
   }

   public String getColor()
   {
     return color; 
   }

   public String toString()
   {
    return color + " Marble";
   }
 }