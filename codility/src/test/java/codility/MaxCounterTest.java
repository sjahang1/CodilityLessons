package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCounterTest {

	@Test
	public void simpleTest1() {
		MaxCounter counter = new MaxCounter();
		int size = 5;
		int[] a = {3,4,4,6,1,4,4};
		int[] result = counter.solution(size, a);
		int[] expected = {3, 2, 2, 4, 2};
		
		assertArrayEquals(expected, result);
	}

	@Test
	public void simpleTest2() {
		MaxCounter counter = new MaxCounter();
		int size = 3;
		int[] a = {1,2,3,2,2,4,2};
		int[] result = counter.solution(size, a);
		int[] expected = {3,4,3};
		
		assertArrayEquals(expected, result);
	}
	
}
