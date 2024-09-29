package sample;

import java.util.HashSet;
import java.util.Optional;

public class OverirdeHashcode {
 
	   public static void main(String[] args)  
	   { 
		   /*Employeeee e =new Employeeee();
	     e.setName("a");
	     Employeeee e1 =new Employeeee();
	     e1.setName("a");
	     
	     Employeeee e2 =new Employeeee();
	     e2.setName("b");
	     
	     HashSet<Employeeee> h= new HashSet<Employeeee>();
	     h.add(e);
	     h.add(e1);
	     h.add(e2);
	     System.out.println(h.remove(e1));
	     System.out.println(h.size());*/
	     
	     Employeeee e3 =new Employeeee(Optional.ofNullable(null));
	     Optional<String> name = e3.getName();
	    // name.ifPresent(System.out::println).;
	   } 

}

class Employeeee
{
	Optional<String> name ;
	
	Employeeee(Optional<String> name)
	{
		this.name =name;
	}

	public Optional<String> getName() {
		return name;
	}

	public void setName(Optional<String> name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		return 420;
	}
	
	
	
}
