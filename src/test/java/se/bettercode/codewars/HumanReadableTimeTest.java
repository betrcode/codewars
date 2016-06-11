package se.bettercode.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static se.bettercode.codewars.HumanReadableTime.makeReadable;
import static se.bettercode.codewars.HumanReadableTime.makeReadableUsingDurationFormatUtils;

public class HumanReadableTimeTest {

  @Test
  public void normalTime() {
    assertEquals("01:30:10", makeReadable(10 + (30 * 60) + (1 * 60 * 60)));
    assertEquals("01:30:10", makeReadableUsingDurationFormatUtils(10 + (30 * 60) + (1 * 60 * 60)));
  }

  @Test
  public void twentyFourHours() {
    assertEquals("24:00:00", makeReadable(86400));
    assertEquals("24:00:00", makeReadableUsingDurationFormatUtils(86400));
  }

}
