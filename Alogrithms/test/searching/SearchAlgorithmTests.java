package searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchAlgorithmTests {
	@Test
	public void firstOccuranceOfKTest() {
		int array[] = {1, 100, 200, 300, 400, 500, 500, 500, 500, 600, 700, 800, 900, 1000, 1100, 1100, 1200, 1300};
		assertEquals(5, Search.firstOccuranceOfK(array, 500));
	}
	
	@Test
	public void firstOccuranceOfKWhereKDoesntExistTest() {
		int array[] = {1, 100, 200, 300, 400, 500, 500, 500, 500, 600, 700, 800, 900, 1000, 1100, 1100, 1200, 1300};
		assertEquals(-1, Search.firstOccuranceOfK(array, 501));
	}
	
	@Test
	public void firstOccuranceValueLargerThanKTest() {
		int array[] = {1, 100, 200, 300, 400, 500, 500, 500, 500, 600, 700, 800, 900, 1000, 1100, 1100, 1200, 1300};
		assertEquals(4, Search.firstOccuranceOfValueLargerThanK(array, 350));
	}
	
	@Test
	public void firstOccuranceValueLargerThanKWithDuplicatesTest() {
		int array[] = {1, 100, 200, 300, 400, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 600, 700, 800, 900, 1000, 1100, 1100, 1200, 1300};
		assertEquals(16, Search.firstOccuranceOfValueLargerThanK(array, 500));
	}
	
	@Test
	public void firstOccuranceValueLargerThanKDoesntExistTest() {
		int array[] = {1, 100, 200, 300, 400, 500, 500, 500, 500, 600, 700, 800, 900, 1000, 1100, 1100, 1200, 1300};
		assertEquals(-1, Search.firstOccuranceOfValueLargerThanK(array, 1500));
	}
	
	@Test
	public void indexValueEqualsKeyTest() {
		int array[] = {-4, -2, 0, 2, 4, 6, 8, 10};
		assertEquals(4, Search.indexValueEqualsKey(array));
	}
	
	@Test
	public void indexValueEqualsKey2Test() {
		int array[] = {-2, 1, 300, 400, 500};
		assertEquals(1, Search.indexValueEqualsKey(array));
	}
	
	@Test
	public void indexValueEqualsKeyDoesntExistTest() {
		int array[] = {-5, -4, -3, -2, -1};
		assertEquals(-1, Search.indexValueEqualsKey(array));
	}
	
	@Test
	public void findKInArrayOfUnknownLengthTest() {
		int array[] = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
		assertEquals(8, Search.findKInArrayOfUnknownLengthTest(array, 10));
	}
	
	@Test
	public void findKInArrayOfUnknownLengthTest2() {
		int array[] = {5, 6, 7, 8, 9, 10, 11, 12, 13};
		assertEquals(8, Search.findKInArrayOfUnknownLengthTest(array, 13));
	}
	
}