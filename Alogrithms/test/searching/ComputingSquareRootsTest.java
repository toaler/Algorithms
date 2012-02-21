package searching;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComputingSquareRootsTest {

	@Test
	public void floorOfSquareRoot() {
		for (int i = 7 ; i <= ComputingSquareRoots.MAX_SQUARE_ROOT ; i++) {
			assertEquals((int)Math.floor(Math.sqrt(i)), ComputingSquareRoots.floorOfSquareRoot(i));
		}
	}
	
}
