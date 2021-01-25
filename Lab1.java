import java.io.*; // I/O
import java.util.*; // Scanner Class

public class Lab1
{
    public static void main( String args[])
    {
      final double MILES_PER_MARATHON = 26.21875; //

      Scanner kbd = new Scanner (System.in);

      // THE FOLLOWING THREE VARIBALES ARE PRINTED OUT AT THE END OF THE PROGRAM
      double aveMPH = 0, aveMinsPerMile = 0, aveSecsPerMile = 0;

      // YOUR JOB IS TO DO WHAT YOU HAVE TO TO PUT CORRECT VALUES INTO THEM
      // BEFORE THEY GET PRINTED OUT AT THE BOTTOM

      System.out.print( "Enter marathon time in hrs minutes seconds: "); // i.e. 3 49 37
      // DO NOT WRITE OR MODIFY ANYTHING ABOVE THIS LINE

      double hrs = kbd.nextDouble(); //grab tokens
      double mins = kbd.nextDouble();
      double secs = kbd.nextDouble();

      final int secsPerHour = 3600; //for conversion
      final int secsPerMin = 60;

      double totalSecs = (secs + (mins *secsPerMin) + (hrs * secsPerHour)); //convert to seconds
      aveMPH = MILES_PER_MARATHON / totalSecs * secsPerHour; // then back to hrs

      double aSplitTime = totalSecs / MILES_PER_MARATHON;
      int splitTime = (int) aSplitTime; //manually casting double to int
      aveSecsPerMile = aSplitTime % 60; // use mod to get only secs (remainder)
      aveMinsPerMile = splitTime / secsPerMin % 60; // splitTime must be int or else round up bc format at bottom

      // DO NOT WRITE OR MODIFY ANYTHING BELOW THIS LINE. JUST LET MY CODE PRINT THE VALUES
      //YOU PUT INTO THE 3 VARIBALES
      System.out.println();
      System.out.format("Average MPH was: %.2f mph\n", aveMPH );
      System.out.format("Average mile split was %.0f mins %.1f seconds per mile", aveMinsPerMile, aveSecsPerMile);
      System.out.println();
    }
}
