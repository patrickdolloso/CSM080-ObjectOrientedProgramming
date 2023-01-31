class SideEffects {
  public static void main(String args[]) {
    int i;
    i = 0;
    // i still incremented even though the if statement fails
    if(false & (++i < 100)) System.out.println("this won't be displayed");
    System.out.println("if statemenet executed: " + i); 

    // in this case, i is not incremented because the short-circuit operator skips
    if(false  && (++i < 100)) System.out.println("this won't be displayed");
    System.out.println("if statement executed: " + i);
  }
}