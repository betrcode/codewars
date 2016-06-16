package se.bettercode.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits
 * in descending order. Descending order means that you take the highest digit and place the next highest digit
 * immediately after it.
 *
 * Examples:
 *
 * Input: 145263 Output: 654321
 *
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {


  public static int sortDesc(final int num) {
    //Make num into String and split it into a String[]
    //Sort the chars descending
    //Make String of chars
    //Make int of String
    final String[] chars = String.valueOf(num).split("");
    Arrays.sort(chars, Collections.reverseOrder());
    final String stringResult = Stream.of(chars).collect(Collectors.joining());
    return Integer.parseInt(stringResult);
  }

}