package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		List<List<Integer>> alist =new ArrayList<>();
		List<Integer> alist1=new ArrayList<>();
		alist1.add(1234);
		alist1.add(532632);
		
		List<Integer> alist2=new ArrayList<>();
		alist2.add(2354);
		alist2.add(732634);
		
		alist.add(alist1);
		alist.add(alist2);
		
		
		List<List<Integer>> blist =new ArrayList<>();
		
		List<Integer> blist1=new ArrayList<>();
		blist1.add(1234);
		blist1.add(532632);
		
		List<Integer> blist2=new ArrayList<>();
		blist2.add(234);
		blist2.add(632633);
		
		List<Integer> blist3=new ArrayList<>();
		blist3.add(234);
		blist3.add(632633);
		
		blist.add(blist1);
		blist.add(blist2);
		
		Sample s=new Sample();
		System.out.println(s.get(alist, blist));
		
	}
	
	public List<Integer> get(List<List<Integer>> first, List<List<Integer>> second)
	{
		List<Integer> alist =new ArrayList<>();
		for(List<Integer> i:first)
		{
			alist.add(i.get(0));
		}
		
		List<Integer> blist =new ArrayList<>();
		for(List<Integer> i:second)
		{
			blist.add(i.get(0));
		}
		
		List<Integer> c = new ArrayList<>(blist);
		c.removeAll(alist);
		
		HashMap<Integer, Integer> map =new HashMap<Integer, Integer>();
		for(List<Integer> i1:second)
		{
			if(c.contains(i1.get(0)))
			{
				map.put(i1.get(0), i1.get(1));
			}
		}
		
		// Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > newMap =  new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet()); 
  
        // Sort the list 
        Collections.sort(newMap, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue())-(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : newMap) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp.keySet().stream().collect(Collectors.toList());
	}
	
	

}
