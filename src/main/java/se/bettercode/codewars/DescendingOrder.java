package se.bettercode.codewars;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits
 * in descending order. Descending order means that you take the highest digit and place the next highest digit
 * immediately after it.
 * <p>
 * Examples:
 * <p>
 * Input: 145263 Output: 654321
 * <p>
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {

  public static int sortDesc(final int num) {
    return Integer.parseInt(String.valueOf(num)
        .chars()
        .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining()));
  }

}