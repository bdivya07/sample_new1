package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Test3 {
		public static void main(String[] args) {
			StringBuilder sb =new StringBuilder();
			
			Integer a[] ={5,3};
			Arrays.sort(a,Collections.reverseOrder());
			System.out.println(Arrays.toString(a));
			for(int k=0;k<a.length;k++)
			{
				for(int i=0;i<a[k];i++)
				{
				if(i==0 || i==(a[k]-1))
				{
					for(int j=0;j<a[k];j++)
					{
						sb.append("#");
						
					}
					
				}
				else
				{
					for(int j=0;j<a[k];j++)
					{
						if(j==0 || j==a[k]-1)
						{
							sb.append("#");
						}
						if(j!=a[k]-2)
						 sb.append(" ");
					}
				}
				
				sb.append("\n");
			}
				
			}
			System.out.println(sb.length());
		}
}
