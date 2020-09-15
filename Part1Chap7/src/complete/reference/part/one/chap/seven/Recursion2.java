package complete.reference.part.one.chap.seven;

public class Recursion2 {

  public static void main(String... arg) {
    RecTest ob = new RecTest(5);
    int i;
    for (i = 0; i < 5; i++) {
      ob.values[i] = i;
    }
    ob.printArray(5);
  }
}

class RecTest {
  int values[];

  RecTest(int i) {
    values = new int[i];
  }

  void printArray(int i) {
    if (i == 0) {
      return;
    } else {
      printArray(i - 1);
      //printArray(4)
      //printArray(3)
      //printArray(2)
      //printArray(1)
      //printArray(0)
    }

    System.out.println("[" + (i - 1) + "] " + values[i - 1]);
  }
}
