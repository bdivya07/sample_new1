package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveToend {
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		int j=0;
	    for(int i=0;i<array.size();i++)
			{
				
				if(array.get(i) !=toMove)
				{
					int temp = array.get(i);
					array.set(i,array.get(j));
					array.set(j,temp);
					j++;
				}
			}
	    return array;
	  }
	public static void main(String[] args) {
		Integer[] a=new Integer[] {2, 1, 2, 2, 2, 3, 4, 2};
		List<Integer> l=Arrays.asList(a);
		moveElementToEnd(l,2);
	}

}
