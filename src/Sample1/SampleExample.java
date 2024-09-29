package Sample1;

public class SampleExample {
	
	/*1,1,1
	  1,1
	  
     9,9, 9
       9  9
     10  9   8*/
	
	
	
	public Node add(Node l1, Node l2) {
		
		int carry=0;
		Node current =null;
		Node prev=null;
		while(l1!=null || l2!=null) {
			
			int sum=0;
			
			if(l1.data!=null)
				sum +=l1.dat;
			
			if(l2.data!=null)
				sum +=l2.data;
			
			
			sum + =carry;
			
			carry =sum/10;
			sum = sum %10;
			
			Node node = new Node(sum,null);
			
			if(current ==null) {
				prev = node;
				current =node;
			}
			else {
				
				prev
				
				
			}
			
		}
		
		return current;
	}
	
	
	public Node reverse(Node node) {
		
		Node p =null;
		Node current =node;
		
		while(current !=null) {
			
			Node next = current.next;
			
			current.next = p;
			p=current;
			
			current =next;
			
		}
		
		return p;
		
	}
	
	1,1,1
	
	1,1
	

}
