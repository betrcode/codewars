package se.bettercode.lab;

import java.util.Arrays;
import java.util.List;

public class StringBuilderStreamer {

  public static void main(String[] args) {
    streamToStringBuilder();
  }

  /**
   * Trying to use the Stream.collect method with a StringBuilder
   */
  public static void streamToStringBuilder() {
    List<String> words = Arrays.asList("Hej", "alla", "barn", "nu", "blir", "det", "barnprogram");
    StringBuilder stringBuilder = words.stream()
        .filter(word -> !word.startsWith("b"))
        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    System.out.println(stringBuilder.toString());
  }

}
