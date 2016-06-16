package se.bettercode.codewars;

/**
 * Create a function isDivisible(n,...) that checks if the first argument n is divisible by all other arguments
 * (return true if no other arguments)
 *
 * Example:
 *
 * This kata is following kata: http://www.codewars.com/kata/is-n-divisible-by-x-and-y
 *
 * Notes: Solution must (apparently use int[] as signature)
 */
public class Divisible {

  public static boolean isDivisible(int... numbers){
    final int number = numbers[0];
    for (int i : numbers) {
      if (!isDivisibleBy(number, i)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isDivisibleBy(int a, int b) {
    return b != 0 && a % b == 0;
  }
}