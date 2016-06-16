package se.bettercode.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindOutlierTest {

  /**
   * Given from codewars example
   */
  @Test
  public void testExample() {
    int[] exampleTest1 = {2,6,8,-10,3};
    int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
    assertEquals(3, FindOutlier.find(exampleTest1));
    assertEquals(206847684, FindOutlier.find(exampleTest2));
    assertEquals(0, FindOutlier.find(exampleTest3));
  }


  /**
   * Added from instructions
   */
  @Test
  public void negativeNumber() {
    int[] withNegativeNumber = {160, 3, 1719, 19, 11, 13, -21};
    assertEquals(160, FindOutlier.find(withNegativeNumber));
  }

  /**
   * Added from instructions
   */
  @Test
  public void oddExample() {
    int[] oddExample = {2, 4, 0, 100, 4, 11, 2602, 36};
    assertEquals(11, FindOutlier.find(oddExample));
  }

  @Test(expected = IllegalArgumentException.class)
  public void badArgument() {
    int[] tooFewArguments = {2,2};
    FindOutlier.find(tooFewArguments);
  }

  @Test(expected = IllegalArgumentException.class)
  public void noOutlier() {
    int[] tooFewArguments = {2,4,6};
    FindOutlier.find(tooFewArguments);
  }

}
