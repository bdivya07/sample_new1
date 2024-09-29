package String;

import java.util.HashMap;

public class LongestSubstringWithoutDuplication {
	public static String longestSubstringWithoutDuplication(String str) {
	    HashMap<Character,Integer> map =new HashMap<>();
			int start=0;
			int beg=0;
			int end=1;
			
			for(int i=0;i<str.length();i++)
			{
				char c= str.charAt(i);
				if(map.containsKey(c))
				{
					start =Math.max(start,map.get(c) +1);
				}
				if(end-beg < i+1 - start)
				{
					beg= start;
					end=i+1;
				}
				map.put(c,i);
				
			}
			
			return str.substring(beg,end);
	  }
	public static void main(String[] args) {
		System.out.println(longestSubstringWithoutDuplication("clementisacap"));
	}

}
