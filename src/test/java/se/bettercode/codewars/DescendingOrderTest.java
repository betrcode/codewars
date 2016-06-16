package se.bettercode.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {

  @Test
  public void zero() {
    assertEquals(0, DescendingOrder.sortDesc(0));
  }

  @Test
  public void simple() {
    assertEquals(51, DescendingOrder.sortDesc(15));
  }

  @Test
  public void reverseIt() {
    assertEquals(987654321, DescendingOrder.sortDesc(123456789));
  }

  @Test
  public void duplicates() {
    assertEquals(844331111, DescendingOrder.sortDesc(133448111));
  }
}