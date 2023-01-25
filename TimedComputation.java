/*
- This program performs some math computations and displays the results.
- Also displays the value of the constant Math.PI
- Reports the number of seconds that the computer spent on this task
*/

public class TimedComputation {
  public static void main(String[] args) {
    long startTime; // Starting time of program, in nanosec
    long endTime; // Time when computations are done, in nanosec
    long compTime;
    double seconds;

    startTime = System.nanoTime();

    double width, height, hyp; // sides of a triangle
    width = 42.0;
    height = 17.0;
    hyp = Math.sqrt(width*width + height*height);
    System.out.print("A triangle with sides 42 and 17 has hyp: ");
    System.out.println(hyp);

    System.out.println("\nMathematically, sin(x)*sin(x) + " + "cos(x)*cos(x) - 1 should be 0");

  }
}