package complete.reference.part.one.chap.three;

public class ScopeError {
  public static void main(String args[]) {
    int bar = 1;
    {
      // creates a new scope
      //int bar = 2; // Compile-time error – bar already defined!
    }
  }
}
