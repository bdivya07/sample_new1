package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumDistances {

	static int sumOfMinAbsDifferences(
			int arr[] ,int n)
			{

			Arrays.sort(arr);
			int sum = 0;

			sum += Math.abs(arr[0] -arr[1]);
			sum += Math.abs(arr[n-1] -arr[n-2]);

			for (int i = 1; i < n - 1; i++)
			{
			sum +=Math.min(Math.abs(arr[i] - arr[i-1]),Math.abs(arr[i] - arr[i+1])); // Total sum of minimum absolute difference
			System.out.println(Math.abs(arr[i] - arr[i-1]));
			}
			return sum;
			}

	public static void main(String args[]) {
		int arr[] = {1,2,1,1,2,3 };
		int n = arr.length;

		System.out.println("Sum = " + sumOfMinAbsDifferences(arr, n));
	}

}
