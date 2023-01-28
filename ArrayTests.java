import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {5, 4, 3};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{3, 4, 5}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { }; 
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverage() {
    double[] input1 = { };
    double[] input2 = {1, 2, 3};
    double[] input3 = {-1, -2, -3};
    double[] input4 = {0, 0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0f);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input2), 0.0f);
    assertEquals(-1.5, ArrayExamples.averageWithoutLowest(input3), 0.0f);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input4), 0.0f);
  }
}
