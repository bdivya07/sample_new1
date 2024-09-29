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

public class Sample1 {
	public static void main(String[] args) {
		List<List<Integer>> alist =new ArrayList<>();
		List<Integer> alist1=new ArrayList<>();
		alist1.add(1234);
		alist1.add(532632);
		
		List<Integer> alist2=new ArrayList<>();
		alist2.add(234);
		alist2.add(632633);
		
		List<Integer> alist3=new ArrayList<>();
		alist3.add(2354);
		alist3.add(732634);
		
		
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
		blist3.add(458);
		blist3.add(642633);
		

		List<Integer> blist4=new ArrayList<>();
		blist4.add(458);
		blist4.add(732634);
		
		blist.add(blist1);
		blist.add(blist2);
		blist.add(blist3);
		blist.add(blist4);
		
		Sample s=new Sample();
		System.out.println(s.get(alist, blist));
		
	}
	public static List<Integer> missingReservations(List<List<Integer>> firstReservationList, List<List<Integer>> secondReservationList) {
        
	    // Write your code here
	        List<Integer> a = new ArrayList<>();
	        
	        for(List<Integer> i : firstReservationList) {
	            a.add(i.get(0));
	        }
	        
	        List<Integer> b = new ArrayList<>();
	        
	        for(List<Integer> i : secondReservationList) {
	            b.add(i.get(0));
	        }
	    
	        List<Integer> c = new ArrayList<>(b);
	        c.removeAll(a);
	    
	        HashMap<Integer, Integer> m = new HashMap<>();
	        for(List<Integer> i : secondReservationList) {
	            if(c.contains(i.get(0))){
	                m.put(i.get(0), i.get(1));
	            }
	        }
	        
	        List<Map.Entry<Integer, Integer>> nm = new LinkedList<>();
	        
	Collections.sort(nm, new Comparator<Map.Entry<Integer, Integer>> (){
	    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	        return (o1.getValue())-(o2.getValue());
	    }
	});

	 HashMap<Integer, Integer> t = new LinkedHashMap<>();
	for(Map.Entry<Integer, Integer> q: nm) {
	    t.put(q.getKey(), q.getValue());
	}

	return t.keySet().stream().collect(Collectors.toList());

	}
}
