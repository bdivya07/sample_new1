package array;

import java.util.Arrays;

public class RainWater {
	public static void main(String[] args) {
		RainWater r=new RainWater();
		int [] a= {1, 0, 0, 0, 9, 0, 0, 0, 0, 0, 10, 18};
		System.out.println(r.trap(a));
	}
	
	 public int trap(int[] arr)
	    {
			int left[]=new int[arr.length+1];
			left[0]=0;
			for(int i=0;i<arr.length-1;i++)
			{
				left[i+1]=Math.max(left[i],arr[i] );
			}
			System.out.println(Arrays.toString(left));
			int rightHighest=0;
			int total=0;
			for(int i=arr.length-1;i>=0;i--)
			{
				 rightHighest=Math.max(rightHighest, arr[i]);
				 total +=Math.min(left[i], rightHighest)> arr[i]? Math.min(left[i], rightHighest)-arr[i]:0;
			}
			return total;
		
	    }

}
