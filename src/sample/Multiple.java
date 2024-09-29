package sample;

import java.util.LinkedList;
import java.util.Queue;

public class Multiple {

	public static void main(String[] args) {
		Multiple m =new Multiple();
		System.out.println(m.getMultiple(18));
		String str ="/csp/gateway/slc/api/service-invitations/00c0ff4d-6a84-46eb-8b95-9534407f3366";
		String separator = "/";
		
	        final int pos = str.lastIndexOf(separator);
	        
	       System.out.println( str.substring(pos + separator.length()));


	}

	public String getMultiple(int n)
	{

	  Queue<String> q =new LinkedList<>();

	  	q.add("1");

	      while(!q.isEmpty())
	      {
			String r= q.remove();
			
			int rem = mod(r,n);
			if(rem==0)
				return r;

	         q.add(r+'0');
			 q.add(r+'1');

	      }

	
	      return "not found";
	}
	
	private int mod(String r , int n)
	{
		int a =0;
			for(int i=0;i<r.length();i++)
	  		{
				a = a*10 +(r.charAt(i)-'0');
				a %= n;
	  
	  		}
			return  a;

	}


}
