// Demonstrate block scope.
class ScopeDemo {
  public static void main(String args[]) {
    int x; // known to all code within main
    x = 10;
    if(x == 10) { //start new scope
      int y = 20; //onlu known to this block
      // x and y both known here.
      System.out.println("x,y: " +x + " " + y);    
      x = y*2;

    }
    System.out.println("x is:" + x);
  }
}