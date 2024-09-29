package array;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumtoremoveValid {
	public static void main(String[] args) {
		MinimumtoremoveValid m =new MinimumtoremoveValid();
		//System.out.println(m.minRemoveToMakeValid("(a(b(c)d)))")); //(a(b(c)d))
		//System.out.println(m.minRemoveToMakeValid("())(()))()()(()(()")); //()(())()()()()
		System.out.println(m.minRemoveToMakeValid("abc(c(c)f)dv)")); //abc(c(c)f)dv
	}
	public String minRemoveToMakeValid(String s) {
        Set<Integer> set =new HashSet<>();
        Stack<Integer> stack =new Stack<>();
        StringBuilder st =new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack.push(i);
            
            else if(s.charAt(i)==')')
            {
               if(stack.isEmpty())
                   set.add(i);
                else
                    stack.pop();
            }
        }
        
        while(!stack.isEmpty())
            set.add(stack.pop());
        
        for(int i=0;i<s.length();i++)
        {
            if(! set.contains(i))
                st.append(s.charAt(i));
        }
        return st.toString();
        
    }

}
