package se.bettercode.codewars;

import java.time.Duration;

import static java.time.Duration.ofSeconds;
import static org.apache.commons.lang3.time.DurationFormatUtils.formatDuration;

/**
 * Two different solutions here. Only one submittable for Codewars.
 */
public class HumanReadableTime {

  /**
   * Submitted to Codewars. Nice because this is a natural use of Duration.
   * Not the shortest possible code, but still nice.
   */
  public static String makeReadable(int seconds) {
    final Duration duration = Duration.ofSeconds(seconds);
    final long hours = duration.toHours();
    final long minutes = duration.minusHours(hours).toMinutes();
    final long secs = duration.minusHours(hours).minusMinutes(minutes).getSeconds();
    return String.format("%02d:%02d:%02d", hours, minutes, secs);
  }

  /**
   * Solution not OK for Codewars since I cannot import DurationFormatUtils there.
   */
  public static String makeReadableUsingDurationFormatUtils(int seconds) {
    return formatDuration(ofSeconds(seconds).toMillis(), "HH:mm:ss");
  }

}
