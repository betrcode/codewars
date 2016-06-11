package se.bettercode.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Has not passed CodeWars tests, but those are slightly broken and won't tell you what's wrong...
 */
public class Abbreviator {

  public String abbreviate(String string) {
    final String[] words = string.split("[^a-zA-Z']+");
    final List<String> wordList = Arrays.asList(words);
    final List<String> abbreviations = new ArrayList<>();
    for (String word : wordList) {
      abbreviations.add(abbreviateSingleWord(word));
      abbreviations.add(getSeparator(word, string));
    }

    StringBuilder sb = new StringBuilder();
    for (String abbreviation : abbreviations) {
      sb.append(abbreviation);
    }
    return sb.toString();
  }

  /**
   * Gets the separator character after the word. Assumes the separator is a single char.
   */
  private String getSeparator(String afterWord, String string) {
    final int pos = string.indexOf(afterWord) + afterWord.length();
    try {
      return string.substring(pos, pos+1);
    } catch (StringIndexOutOfBoundsException e) {
      return "";
    }
  }

  public static String abbreviateSingleWord(String word) {
    final int wordLength = word.length();
    if (wordLength < 3) {
      return word;
    }
    final String firstChar = word.substring(0, 1);
    final String lastChar = word.substring(wordLength - 1, wordLength);
    return firstChar + String.valueOf(wordLength - 2) + lastChar;
  }

}
