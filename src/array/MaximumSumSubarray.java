package array;

public class MaximumSumSubarray {
	public static void main(String[] args) {
		
	}
	
	public int getMaximumSum(int [] a)
	{
		int max_so_far=0;
		int result=0;
		int beg=0;
		int end=0;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			max_so_far =max_so_far +a[i];
			if(max_so_far <0)
			{
				max_so_far =0;
				j=i+1;
			}
			if(max_so_far> result)
			{
				result=max_so_far;
				beg= j;
				end=i;
			}
		}
		return 0;
	}

}
