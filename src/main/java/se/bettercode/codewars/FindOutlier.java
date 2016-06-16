package se.bettercode.codewars;

/**
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The integers in the array are either entirely odd or entirely even except for a single integer N. Write a method that
 * takes the array as an argument and returns N.
 *
 * For example:
 *
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 *
 * Should return: 11
 *
 * [160, 3, 1719, 19, 11, 13, -21]
 *
 * Should return: 160
 */
public class FindOutlier {

  enum Parity {
    EVEN, ODD
  }

  static int find(int[] integers) {
    if (integers.length < 3) {
      throw new IllegalArgumentException("At least 3 integers must be supplied.");
    }
    final Parity outlier = getOutlierParity(integers);
    return getOutlier(integers, outlier);
  }

  /**
   * Given a array of integers, finds the "outlier"
   */
  private static Parity getOutlierParity(int[] integers) {
    int evenCount = 0;
    int oddCount = 0;
    //Only need to check the 3 first numbers to find the outlier parity
    for (int i = 0; i < 3; i++) {
      if (isOddOrEven(integers[i]) == Parity.EVEN) {
        evenCount++;
      } else {
        oddCount++;
      }
    }
    return evenCount < oddCount ? Parity.EVEN : Parity.ODD;
  }

  private static Parity isOddOrEven(int i) {
    return i % 2 == 0 ? Parity.EVEN : Parity.ODD;
  }

  private static int getOutlier(int[] integers, Parity outlier) {
    for (int i=0; i<integers.length; i++) {
      if (isOddOrEven(integers[i]).equals(outlier)) {
        return integers[i];
      }
    }
    throw new IllegalArgumentException("No outlier found!");
  }

}
