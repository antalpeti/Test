package trickyexamples;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String args[]) {

    System.out.println("Enter number upto which Fibonacci series to print: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    System.out.println("Fibonacci series upto " + number + " numbers : ");

    for (int i = 1; i <= number; i++) {
      System.out.print(fibonacci2(i) + " ");
    }
    System.out.println();
    sc.close();

    System.out.println("\nSum of fibonacci numbers under 1000:");
    sumFibonacci();
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
   * Java program to calculate Fibonacci number using loop or Iteration.
   *
   * @return Fibonacci number
   */
  public static int fibonacci2(int number) {
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
    int fibo1 = 1, fibo2 = 1, fibonacci = 0, sum = 0;
    while (fibonacci < 1000) {
      fibonacci = fibo1 + fibo2;
      fibo1 = fibo2;
      fibo2 = fibonacci;
      sum += fibonacci;
    }
    System.out.println(sum);
  }
}
