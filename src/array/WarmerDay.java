package array;

import java.util.Stack;

public class WarmerDay {
	
	public int[] dailyTemperatures(int[] arr)
    {
        int ans[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()])
            {
                stack.pop();
            }
            ans[i]= stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        
        return ans;
    }
	public static void main(String[] args)
	{
		
		WarmerDay w=new WarmerDay();
		int a[]={1,1,5,10,2,20,30};
		//int a[] = {1,1,4,5,2,10};
		int b[]=w.dailyTemperatures(a);
		for(int i=0;i<b.length ;i++)
		{
			System.out.println(b[i]);
		}
	}

}
