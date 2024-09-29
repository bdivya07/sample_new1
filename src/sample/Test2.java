package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Test2 {
		public static void main(String[] args) {
			StringBuilder sb =new StringBuilder();
			
			int a =5;
			for(int i=0;i<a;i++)
			{
				if(i==0 || i==(a-1))
				{
					for(int j=0;j<a;j++)
					{
						sb.append("#");
					}
					
				}
				else
				{
					for(int j=0;j<a;j++)
					{
						if(j==0 || j==a-1)
						{
							sb.append("#");
						}
						if(j!=a-2)
						 sb.append(" ");
					}
				}
				
				sb.append("\n");
				
			}
			System.out.println(sb);
			System.out.println(sb.length());
		}
}
