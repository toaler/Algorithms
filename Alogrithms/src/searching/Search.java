package searching;

public class Search {
	public static int firstOccuranceOfK(int[] array, int i) {
		int lower = 0, upper = array.length - 1, middle;

		while (lower <= upper) {
			middle = lower + (upper - lower)/2;
			
			if (array[middle] == i) {
				while (array[middle -1] == i) {
					middle--;
				}
				
				return middle;
			}
			else if (array[middle] < i) {
				lower = middle + 1;
			}
			else {
				upper = middle - 1;
			}
		}

		return -1;
	}

	public static int firstOccuranceOfValueLargerThanK(int[] array, int i) {
		int lower = 0, upper = array.length - 1, middle;

		while (lower <= upper) {
			middle = lower + (upper - lower)/2;
			
			if (array[middle] == i) {
				do {
					middle++;
				} while (array[middle] == i);
				
				return middle;
			}
			else if (array[middle] < i) {
				lower = middle + 1;
			}
			else {
				upper = middle - 1;
			}
		}

		if (lower < array.length) {
			return lower;
		}
		
		return -1;
	}

	public static int indexValueEqualsKey(int[] array) {
		int lower = 0, upper = array.length - 1, middle;

		while (lower <= upper) {
			middle = lower + (upper - lower)/2;
			
			if (array[middle] == middle) {
				return middle;
			}
			else if (array[middle] < middle) {
				lower = middle + 1;
			}
			else if (array[middle] > middle){
				upper = middle - 1;
			}
		}
		
		return -1;
	}

	public static int findKInArrayOfUnknownLengthTest(int[] array, int i) {
		int j = 0, middle = 0, upper = 0;

		while (true) {
			try {
				int c = array[(int) Math.pow(2, j) - 1];
				if (c == i) {
					return (int) Math.pow(2, j) - 1;
				}
				else if (c >= i) {
					break;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			j++;
		}
		
		int lower = (int) Math.pow(2, j - 1) - 1;
		upper = (int) Math.pow(2, j ) - 1;
		
		while (lower <= upper) {
			middle = lower + (upper - lower)/2;
			
			try {
				if (array[middle] > i) {
					upper = middle - 1;
				}
				else if (array[middle] == i) {
					return middle;
				}
				else if (array[middle] < i) {
					lower = middle + 1;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				upper = middle;
			}
		}
		
		return -1;
	}
}
