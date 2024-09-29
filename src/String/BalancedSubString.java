package String;

import java.util.Stack;
import java.util.UUID;

public class BalancedSubString {
	public static void main(String[] args) {
System.out.println(UUID.randomUUID());
	}
	
	int get(String s)
	{
		Stack<Integer> stack =new Stack<Integer>();
		int max=0;
		stack.push(-1);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				stack.push(i);
			else
			{
				stack.pop();
				if(stack.isEmpty())
					stack.push(i);
				
				int j = stack.peek();
				int k = i - j;
				max= Math.max(k, max);
				
			}
		}
		return max;
	}

}
