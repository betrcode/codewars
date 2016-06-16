package se.bettercode.codewars;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DivisibleTest {

  /**
   * From Codewars
   */
  @Test
  public void basicTests() throws Exception {
    assertEquals(Divisible.isDivisible(3,3,4),false);
    assertEquals(Divisible.isDivisible(12,3,4),true);
    assertEquals(Divisible.isDivisible(8,3,4,2,5),false);
  }

  @Test
  public void singleArgumentIsDivisibleByItself() {
    assertTrue(Divisible.isDivisible(2));
  }

  @Test
  public void divisionByZero() {
    assertFalse(Divisible.isDivisible(2, 0));
  }
}
