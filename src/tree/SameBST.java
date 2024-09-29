package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameBST {
	public static void main(String[] args) {
		Integer [] a=new Integer [] {10, 15, 8, 12, 94, 81, 5, 2, 10};
		Integer [] b=new Integer [] {10, 8, 5, 15, 2, 10, 12, 94, 81};
		List<Integer> l=Arrays.asList(a);
		System.out.println(sameBsts(Arrays.asList(a),Arrays.asList(b)));
		
	}
	public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
		if(arrayOne.size() != arrayTwo.size())
			return false;
		
	    if(arrayOne.get(0).intValue() != arrayTwo.get(0).intValue())
			{
				return false;
	    }
			
			 if(arrayOne.get(0).intValue() == arrayTwo.get(0).intValue())
			{
				return true;
	    }
		
		  
			
			List<Integer> smallerOne =getsmaller(arrayOne);
			List<Integer> smallerTwo =getsmaller(arrayTwo);
			List<Integer> largerOne =getLarger(arrayOne);
			List<Integer> largerTwo =getLarger(arrayTwo);
			
			return sameBsts(smallerOne,smallerTwo) && sameBsts(largerOne,largerTwo);
			
	}
		
	public static List<Integer> getsmaller(List<Integer> arrayOne)
	{
		List<Integer> small =new ArrayList<>();
		for(int i=1;i<arrayOne.size();i++)
		{
			if(arrayOne.get(i)< arrayOne.get(0))
			{
				small.add(arrayOne.get(i));
			}
		}
		return small;
	}
	public static List<Integer> getLarger(List<Integer> arrayOne)
	{
		List<Integer> large =new ArrayList<>();
		for(int i=1;i<arrayOne.size();i++)
		{
			if(arrayOne.get(i)>=arrayOne.get(0))
			{
				large.add(arrayOne.get(i));
			}
		}
		return large;
	}

}
