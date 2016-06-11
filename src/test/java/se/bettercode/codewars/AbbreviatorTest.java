package se.bettercode.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static se.bettercode.codewars.Abbreviator.abbreviateSingleWord;

public class AbbreviatorTest {

  private Abbreviator abbreviator = new Abbreviator();

  @Test
  public void i18n() {
    assertEquals("i18n", abbreviateSingleWord("internationalization"));
  }

  @Test
  public void a11y() {
    assertEquals("a11y", abbreviateSingleWord("accessibility"));
  }

  @Test
  public void shortWordIsNotAbbreviated() {
    assertEquals("at", abbreviateSingleWord("at"));
  }

  @Test
  public void threeLetterWordIsMoreObfuscatedThanAbbreviated() {
    assertEquals("s1t", abbreviateSingleWord("set"));
  }

  @Test
  public void twoWords() {
    assertEquals("e6t-r2e", abbreviator.abbreviate("elephant-ride"));
  }

}
