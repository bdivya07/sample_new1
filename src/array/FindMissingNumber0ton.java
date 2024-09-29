package array;

public class FindMissingNumber0ton {
	public static void main(String[] args) {
		int a[]= {1,1,3};
		System.out.println(missingNumber(a));
	}
	
	
	public static int  missingNumber(int[] a) {
		  int sum = 0;
		  int expectedSum = 0;
		  int n = 1; // will be tracking all the natural numbers, 1..|nums| (excluding 0)
		  for (int arr:a) 
		  {
		    sum += arr;
		    expectedSum += n++;
		  }
		  
		  // missing
		  return expectedSum - sum;
		};

}
