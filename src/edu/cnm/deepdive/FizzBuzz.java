package edu.cnm.deepdive;

public class FizzBuzz {

  public static String[] fizzBuzz(int start, int end) {
    String[] bins = new String[end - start];
    for (int i = start; i < end; i++) {
      // // The next 6 lines are replaced by the ternary-operator-based assignment statement below.
      // String envelope;
      // if (i % 3 == 0) {
      //   envelope = "Fizz";
      // } else {
      //   envelope = "";
      // }
      String envelope = (i % 3 == 0) ? "Fizz" : "";
      if (i % 5 == 0) {
        envelope += "Buzz";
      }
      if (envelope.isEmpty()) {
        envelope += i;
      }
      bins[i - start] = envelope;
    }
    return bins;
  }


}
