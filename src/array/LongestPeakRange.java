package array;

public class LongestPeakRange {
	public static void main(String[] args) {
		int a[]=new int[] {1, 2, 3, 4, 5, 1};
		longestPeak(a);
	}
	public static int longestPeak(int[] array) {
		int i = 1;
		int result = 0;
		while (i <= array.length - 2) {

			if (array[i - 1] < array[i] && array[i + 1] < array[i]) {

				int left = i - 2;
				while (left > 0 && array[left] < array[left - 1]) {
					left--;
				}

				int right = i + 2;
				while (right < array.length - 1 && array[right] < array[right - 1]) {
					right++;
				}
				int end = right - left - 1;
				if (result < end) {
					result = end;
				}

				i = right;
			} else {
				i++;
			}

		}
		return result;
	}
}
