package trickyexamples;


public class Fibonacci {

  public static void main(String args[]) {

    int number = 10;
    System.out.println("Fibonacci series upto " + number + " numbers : ");

    for (int i = 1; i <= number; i++) {
      System.out.print(fibonacciIter(i) + " ");
    }
    System.out.println();

    System.out.println("\nSum of fibonacci numbers under 1000:");
    sumFibonacci();

    System.out.println("The 10 th Fibonacci number");
    System.out.println(fibonacciRec(10));
    System.out.println(fibonacciTailRec(3));
  }


  /**
   * Java program for Fibonacci number using recursion. This program uses tail recursion to
   * calculate Fibonacci number for a given number
   *
   * @return Fibonacci number
   */
  public static int fibonacci(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }

    return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
  }

  /**
   * Calculate the n<sup>th</sup> Fibonacci number.
   *
   * @param n
   * @return
   */
  public static int fibonacciRec(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    } else {
      return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
  }

  public static long fibonacciTailRec(long n) {
    if (n <= 2) {
      return 1;
    }
    return fibonacciTailRecAux(0, 1, n);
  }

  private static long fibonacciTailRecAux(long a, long b, long count) {
    if (count <= 0) {
      return a;
    }
    return fibonacciTailRecAux(b, a + b, count - 1);
  }

  /**
   * Java program to calculate Fibonacci number using loop or Iteration.
   *
   * @return Fibonacci number
   */
  public static int fibonacciIter(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }
    int fibo1 = 1, fibo2 = 1, fibonacci = 1;
    for (int i = 3; i <= number; i++) {

      fibonacci = fibo1 + fibo2;
      fibo1 = fibo2;
      fibo2 = fibonacci;

    }
    return fibonacci; // Fibonacci number
  }

  public static void sumFibonacci() {
    int fibo1 = 1, fibo2 = 0, fibonacci = 0, sum = 0;
    while (fibonacci < 1000) {
      fibonacci = fibo1 + fibo2;
      fibo1 = fibo2;
      fibo2 = fibonacci;
      sum += fibonacci;
      System.out.println(fibonacci);
    }
    System.out.println(sum);
  }
}
