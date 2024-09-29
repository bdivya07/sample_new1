package sample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		A a=new A();
		A b=new A();
		a.name="asd";
		b.name="dfg";
		TreeSet<A> set =new TreeSet<A>();
		set.add(a);
		set.add(b);
		//String s
	}
	

}

class A implements Comparator<A>
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(A o1, A o2) {
		return 0;
	}
	
	
}
