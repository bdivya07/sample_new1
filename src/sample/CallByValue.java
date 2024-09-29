package sample;

public class CallByValue {
	public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = i; 
	      i = j; 
	      j = temp; 
	      System.out.println(i+ " "+j);
	   } 
	
	public static void s1(int i,int j)
	{
		
	}
	   public static void main(String[] args)  
	   { 
	      Integer i = new Integer(10); 
	      Integer j = new Integer(20); 
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j); 
	      
	      swap(10,20);
	      s1(i,j);
	   } 

}
