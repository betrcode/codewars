package se.bettercode.codewars;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BlockTest {

  @Test
  public void measurementsExampleBlock() {
    Block block = new Block(new int[]{2, 4, 6});
    assertEquals(2, block.getWidth());
    assertEquals(4, block.getLength());
    assertEquals(6, block.getHeight());
    assertEquals(48, block.getVolume());
    assertEquals(88, block.getSurfaceArea());
  }

  @Test
  public void measurementsOfCube() {
    Block block = new Block(new int[]{4, 4, 4});
    assertEquals(4, block.getWidth());
    assertEquals(4, block.getLength());
    assertEquals(4, block.getHeight());
    assertEquals(64, block.getVolume());
    assertEquals(96, block.getSurfaceArea());
  }
}
