package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Test4 {
		public static void main(String[] args) {
			StringBuilder sb =new StringBuilder();
			
			Integer a[] ={5,3};
			Arrays.sort(a,Collections.reverseOrder());
			System.out.println(Arrays.toString(a));
			int m=0;
			for(int k=0;k<a.length;k++)
			{
				for(int i=0;i<a[k];i++)
				{
				if(i==0 || i==(a[k]-1))
				{
					for(int j=0;j<a[k];j++)
					{
						if(m==0)
						  sb.append("#");
						else
							sb.setCharAt(j, '#');
						
						
					}
					
				}
				else
				{
					for(int j=0;j<a[k];j++)
					{
						if(j==0 || j==a[k]-1)
						{
							if(m==0)
								  sb.append("#");
								else
								{
									System.out.println(sb.charAt(j));
									sb.setCharAt(j, '#');
								}
						}
						if(j!=a[k]-2)
						 sb.append(" ");
					}
				}
				
				sb.append("\n");
			}
				m++;
				System.out.println(sb);
				System.out.println(sb.length());
			}
			//System.out.println(sb);
		}
}
