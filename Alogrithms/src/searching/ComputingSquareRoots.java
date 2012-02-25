package searching;

public class ComputingSquareRoots {
	public static final int MIN_SQUARE_ROOT = 0;
	public static final int MAX_SQUARE_ROOT = 46340;
	private static int iterations = 0;
	
	public static int floorOfSquareRoot(int number) {
		int lower = MIN_SQUARE_ROOT, upper = MAX_SQUARE_ROOT, middle = 0;
		ComputingSquareRoots.iterations = 0;

		while (lower + 1 < upper) {
			iterations++;
			middle = lower + ((upper - lower)/2);
			
			if ((middle * middle) < number ) {
				lower = middle;
			}
			else if (number < (middle * middle)) {
				upper = middle;
			}
			else {
				return middle;
			}
		}

		return lower;
	}
}
