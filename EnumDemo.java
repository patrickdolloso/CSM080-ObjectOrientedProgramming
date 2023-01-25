public class EnumDemo{
  // Define two enum types for use in this program

  enum Day {SUN, MON, TUE, WED, THU, FRI, SAT}
  enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

  public static void main(String[] args) {

    Day tgif; // declare variable of type of Day
    Month libra; // Declare variable of type Month

    tgif = Day.FRI;
    libra = Month.OCT;
    
         System.out.print("My sign is libra, since I was born in ");
         System.out.println(libra);   // Output value will be:  OCT
         System.out.print("That's the ");
         System.out.print( libra.ordinal() );
         System.out.println("-th month of the year.");
         System.out.println("   (Counting from 0, of course!)");
         
         System.out.print("Isn't it nice to get to ");
         System.out.println(tgif);   // Output value will be:  FRIDAY
          
         System.out.println( tgif + " is the " + tgif.ordinal() 
                                            + "-th day of the week.");
  }
}