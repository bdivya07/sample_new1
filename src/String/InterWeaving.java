package String;

public class InterWeaving {
	
		  public static boolean interweavingStrings(String one, String two, String three) {
		    if(three.length() != one.length() + two.length())
					return false;
				
		    return getString( one, two, three,0,0);
		  }
			
			private static boolean getString(String one,String two,String three,int i,int j)
			{
				System.out.println("hiii");
				int k= i+j;
				if(k == three.length())
					return true;
				
				if(i<one.length() && one.charAt(i) == three.charAt(k))
				{
					return getString(one,two,three,i+1,j);
						
				}
					 
				if(j<two.length() && two.charAt(j) == three.charAt(k))
				{
					return getString(one,two,three,i,j+1);
						//return true;
				}
					
					return false;
			}
public static void main(String[] args) {
	InterWeaving i=new InterWeaving();
	i.interweavingStrings("aabcc", "dbbca", "aadbbcbcac");
}


}
