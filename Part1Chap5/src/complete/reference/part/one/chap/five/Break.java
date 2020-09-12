package complete.reference.part.one.chap.five;

public class Break {
  public static void main(String... arg) {
    boolean t = true;

    first:
    {
      second:
      {
        third:
        {
          System.out.println("Before the break.");
          if (t) {
            break first; // break out of second block System.out.println("This won't execute");
          }
        }
        System.out.println("This won't execute");
      }
      System.out.println("This is after second block.");
    }
    System.out.println("This is after first block.");

  }
}
