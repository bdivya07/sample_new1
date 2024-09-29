package array;

import java.util.HashMap;

public class Anagram {
	public static void main(String[] args) {
		String s ="123456";
		Anagram a =new Anagram();
		//System.out.println(a.minSteps("456", "123"));
		System.out.println(a.minSteps(s.substring(s.length()/2), s.substring(0, s.length()/2)));
	}

	    public int minSteps(String s1, String s2) {
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(char c : s1.toCharArray())
	        {
	            if(map.containsKey(c))
	                map.put(c,map.get(c)+1);
	            else
	                map.put(c,1);
	        }
	        for(char c : s2.toCharArray())
	        {
	            if(map.containsKey(c))
	                map.put(c,map.get(c)-1);
	        }
	        int ans=0;
	        for(char c : map.keySet())
	        {
	            if(map.get(c)>0)
	                ans=ans+map.get(c);
	        }
	        return ans;
	    }


}
