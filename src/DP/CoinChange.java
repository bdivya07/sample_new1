package DP;

import java.util.Arrays;
import java.util.Stack;

public class CoinChange {
		  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
	
		    int [] dp =new int[n+1];
				Arrays.fill(dp,Integer.MAX_VALUE);
				dp[0]=0;
				for(Integer d: denoms)
				{
					for(int i=0;i<dp.length;i++)
					{
						if(d<=i)
						{
							if(dp[i-d] == Integer.MAX_VALUE)
							{
							dp[i]= Math.min(dp[i], dp[i-d]);
							}
							else
								dp[i]= Math.min(dp[i], 1+dp[i-d]);
						}
					}
				}
		    return dp[n] != Integer.MAX_VALUE ? dp[n] :-1;
		  }
		  
		  public static void main(String[] args) {
			  CoinChange c=new CoinChange();
			  int[] demons = new int[]{ 2,1 };
			  System.out.println(c.minNumberOfCoinsForChange(3, demons));
		}

}
