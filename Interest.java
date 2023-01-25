public class Interest {
  public static void main(String[] args) {
    /*Declare variables*/
    double principal; // The value of the investment
    double rate; // The annual interest rate
    double interest; // Interest earned in 1 year


    // Do computations:
    principal = 17000;
    rate = 0.027;
    interest = principal * rate; // compute the interest

    principal = principal + interest;

    // output the results:
    System.out.print("The interest earned is: $");
    System.out.println(interest);
    System.out.print("The value of the investment is: $");
    System.out.println(principal);

  }
}